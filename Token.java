/**
   *This program takes in the input from the lexer and gives it a unique ID and returns it
   *@author Robert O' Brien
   *@version 1.1
   *@since 4-12-17
 */
public class Token extends java_cup.runtime.Symbol {

public static final int IDENT = 10;
public static final int IF = 11;
public static final int INT = 12;
public static final int REAL = 13;
public static final int EOF = -1;
public static final int WHILE = 14;
public static final int DO = 15;
public static final int CLASS = 16;
public static final int PUBLIC = 17;
public static final int STATIC = 18;
public static final int VOID = 19;
public static final int FLOAT = 20;
public static final int SPECIAL = 21;
public static final int FOR = 22;


private int tokenID;
private Object value;

public Token (int tokenID, Object value) {
        super(tokenID, value);
        this.tokenID = tokenID;
        this.value = value;
}

public int    getTokenID () {
        return this.tokenID;
}

public Object getValue() {
        return this.value;
}

public String toString() {
        return "Token ID: |" + tokenID + "|" + " Token value: |" + value + "|";
}
}
