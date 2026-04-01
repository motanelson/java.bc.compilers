FROM  rust:latest

COPY hello.rs /hello.rs
RUN chmod +x /hello.rs
RUN rustc hello.rs -o hello
CMD ["./hello"]
