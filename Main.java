import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) throws Exception {

        if (args.length == 0) {
            System.out.println("Uso: java Main ficheiro.bc");
            return;
        }

        String input = new String(Files.readAllBytes(Paths.get(args[0])));

        bcLexer lexer = new bcLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        bcParser parser = new bcParser(tokens);

        // 1. parser cria árvore
        ParseTree tree = parser.programa();

        // 2. visitor compila árvore
        BCToX86Visitor compiler = new BCToX86Visitor();
        compiler.visit(tree);

        // 3. obter assembly FINAL
        String asm = compiler.getAssembly();

        Files.write(Paths.get("output.asm"), asm.getBytes());

        System.out.println("Assembly gerado: output.asm");
    }
}
