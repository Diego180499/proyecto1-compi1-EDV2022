package analizadores;

public class Token {
    
    
    private TokenConstant type;
    private String lexeme;
    private int row;
    private int column;
            
    

    public Token(TokenConstant type, String lexeme) {
        this.type = type;
        this.lexeme = lexeme;
    }

    public Token(TokenConstant type, String lexeme, int row, int column) {
        this.type = type;
        this.lexeme = lexeme;
        this.row = row;
        this.column = column;
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

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public String toString() {
        return "Token : " + "type=" + type + ", lexeme=" + lexeme + ", row=" + row + ", column=" + column+"\n" ;
    }
    
    
    
    
    
    
    
}
