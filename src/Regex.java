public class Regex {

    private final String NUM_REGEX = "(\\d)+";
    private final String OP_REGEX = "(\\+|-|\\*|/)";
    private final String PLUS_REGEX = "(\\+)";
    private final String MINUS_REGEX = "(\\-)";
    private final String SLASH_REGEX = "(/)";
    private final String STAR_REGEX = "(\\*)";
    public Token generateToken(String token) {
        Token generatedToken = null;
        if (token.matches(NUM_REGEX)){
            generatedToken = new Token(TokenType.NUM, token);
        } else if(token.matches(OP_REGEX)){
            generatedToken = new Token(readOperationType(token), token);
        } else {
            throw new LexerError("Unexpected character: " + token);
        }
        
        return generatedToken;
    }

    private TokenType readOperationType(String token){
        TokenType tokenType = null;
        if(token.matches(PLUS_REGEX)) {
            tokenType = TokenType.PLUS;
        }
        else if(token.matches(MINUS_REGEX)) {
            tokenType =  TokenType.MINUS;
        }
        else if(token.matches(SLASH_REGEX)) {
            tokenType =  TokenType.SLASH;
        }
        else if(token.matches(STAR_REGEX)) {
            tokenType = TokenType.STAR;
        }
        return tokenType;
    }
}
