import java.util.List;

public class Main {

    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("/src/Calc1.stk");
            RPNStacker rpn = new RPNStacker();

            String input = reader.readFileBytes();
            Scanner scanner = new Scanner();
            List<Token> tokens = scanner.read(input);

            tokens.forEach(token -> System.out.println(token));
            Token output = rpn.calculate(tokens);

            System.out.println("Saida: " + output.lexeme);
        } catch (Exception error){
            System.out.println(error.getMessage());
        }
    }
}
