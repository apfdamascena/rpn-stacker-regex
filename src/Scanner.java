import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Scanner {

    private final String source;
    private final List<Token> tokens = new ArrayList<>();

    public Scanner(String source){
        this.source = source;
    }

    public List<Token> read(String input){
        StringTokenizer tokenizer = new StringTokenizer(input, Token.TOKEN_DELIMITER);

        while(tokenizer.hasMoreElements()){
            String token = tokenizer.nextToken();
            this.tokens.add(create(token));
        }

        return tokens;
    }

    public Token create(String token){
        return null;
    }


}
