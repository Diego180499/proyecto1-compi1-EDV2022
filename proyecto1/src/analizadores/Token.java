package analizadores;

public class Token {
    
    
    private TokenConstant type;
    private String lexeme;

    public Token(TokenConstant type, String lexeme) {
        this.type = type;
        this.lexeme = lexeme;
    }

    public TokenConstant getType() {
        return type;
    }

    public void setType(TokenConstant type) {
        this.type = type;
    }

    public String getLexeme() {
        return lexeme;
    }

    public void setLexeme(String lexeme) {
        this.lexeme = lexeme;
    }
    
    
    
    
    
    
    
}
