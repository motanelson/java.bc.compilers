import java.util.*;

public class BCToX86Visitor extends bcBaseVisitor<Void> {

    private StringBuilder data = new StringBuilder();
    private StringBuilder text = new StringBuilder();

    private Map<Integer, String> locals = new HashMap<>();

    public String getAssembly() {
        return "section .data\n" +
               data.toString() +
               "\nsection .text\n" +
               "global _start\n\n_start:\n" +
               text.toString() +
               "\nmov eax, 1\nint 0x80\n";
    }

    // ==========================
    // Métodos
    // ==========================
    @Override
    public Void visitMetodo(bcParser.MetodoContext ctx) {
        text.append("\n; metodo ").append(ctx.ID().getText()).append("\n");

        visitChildren(ctx);
        return null;
    }

    // ==========================
    // LOAD
    // ==========================
    @Override
    public Void visitLoad(bcParser.LoadContext ctx) {
        int index = Integer.parseInt(ctx.NUMERO().getText());
        String var = getLocal(index);

        text.append("    push dword [").append(var).append("]\n");
        return null;
    }

    // ==========================
    // STORE
    // ==========================
    @Override
    public Void visitStore(bcParser.StoreContext ctx) {
        int index = Integer.parseInt(ctx.NUMERO().getText());
        String var = getLocal(index);

        text.append("    pop eax\n");
        text.append("    mov [").append(var).append("], eax\n");
        return null;
    }

    // ==========================
    // CONST
    // ==========================
    @Override
    public Void visitConsts(bcParser.ConstsContext ctx) {

        if (ctx.ICONST() != null) {
            String val = ctx.ICONST().getText().replace("iconst_", "");
            text.append("    push ").append(val).append("\n");
        }

        if (ctx.NUMERO() != null) {
            text.append("    push ").append(ctx.NUMERO().getText()).append("\n");
        }

        return null;
    }

    // ==========================
    // OPERAÇÕES
    // ==========================
    @Override
    public Void visitOperadorBinario(bcParser.OperadorBinarioContext ctx) {

        String op = ctx.getText();

        text.append("    pop ebx\n");
        text.append("    pop eax\n");

        if (op.contains("iadd"))
            text.append("    add eax, ebx\n");

        else if (op.contains("isub"))
            text.append("    sub eax, ebx\n");

        else if (op.contains("imul"))
            text.append("    imul eax, ebx\n");

        else if (op.contains("idiv")) {
            text.append("    cdq\n");
            text.append("    idiv ebx\n");
        }

        text.append("    push eax\n");

        return null;
    }

    // ==========================
    // RETURN
    // ==========================
    @Override
    public Void visitRetorno(bcParser.RetornoContext ctx) {

        if (ctx.getText().contains("ireturn")) {
            text.append("    pop eax\n");
        }

        text.append("    ret\n");
        return null;
    }

    // ==========================
    // LABEL
    // ==========================
    @Override
    public Void visitLabelDef(bcParser.LabelDefContext ctx) {
        String label = ctx.rotulo().getText();
        text.append(label).append(":\n");
        return null;
    }

    // ==========================
    // GOTO / IF
    // ==========================
    @Override
    public Void visitControleFluxo(bcParser.ControleFluxoContext ctx) {

        String label = ctx.rotulo().getText();

        if (ctx.getText().startsWith("goto")) {
            text.append("    jmp ").append(label).append("\n");
        }

        else if (ctx.getText().startsWith("ifeq")) {
            text.append("    pop eax\n");
            text.append("    cmp eax, 0\n");
            text.append("    je ").append(label).append("\n");
        }

        else if (ctx.getText().startsWith("ifne")) {
            text.append("    pop eax\n");
            text.append("    cmp eax, 0\n");
            text.append("    jne ").append(label).append("\n");
        }

        return null;
    }

    // ==========================
    // STACK OPS
    // ==========================
    @Override
    public Void visitStackOp(bcParser.StackOpContext ctx) {

        if (ctx.getText().contains("dup")) {
            text.append("    pop eax\n");
            text.append("    push eax\n");
            text.append("    push eax\n");
        }

        if (ctx.getText().contains("pop")) {
            text.append("    pop eax\n");
        }

        return null;
    }

    // ==========================
    // Variáveis locais
    // ==========================
    private String getLocal(int index) {
        if (!locals.containsKey(index)) {
            String name = "var" + index;
            locals.put(index, name);
            data.append(name).append(" dd 0\n");
        }
        return locals.get(index);
    }
}
