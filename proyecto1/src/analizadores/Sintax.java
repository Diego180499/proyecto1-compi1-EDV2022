
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package analizadores;

import java_cup.runtime.*;
import java.util.ArrayList;
import python.Declaracion;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Sintax extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Sintax() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Sintax(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\012\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\003\007\000\002\004\005\000\002\004\005" +
    "\000\002\004\005\000\002\004\005\000\002\004\003\000" +
    "\002\004\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\024\000\004\015\006\001\002\000\006\002\uffff\015" +
    "\006\001\002\000\004\002\025\001\002\000\004\072\007" +
    "\001\002\000\004\037\010\001\002\000\006\073\013\074" +
    "\012\001\002\000\014\041\014\076\016\077\020\100\015" +
    "\101\017\001\002\000\014\041\ufff8\076\ufff8\077\ufff8\100" +
    "\ufff8\101\ufff8\001\002\000\014\041\ufff9\076\ufff9\077\ufff9" +
    "\100\ufff9\101\ufff9\001\002\000\006\002\ufffe\015\ufffe\001" +
    "\002\000\006\073\013\074\012\001\002\000\006\073\013" +
    "\074\012\001\002\000\006\073\013\074\012\001\002\000" +
    "\006\073\013\074\012\001\002\000\014\041\ufffc\076\ufffc" +
    "\077\ufffc\100\015\101\017\001\002\000\014\041\ufffa\076" +
    "\ufffa\077\ufffa\100\ufffa\101\ufffa\001\002\000\014\041\ufffd" +
    "\076\ufffd\077\ufffd\100\015\101\017\001\002\000\014\041" +
    "\ufffb\076\ufffb\077\ufffb\100\ufffb\101\ufffb\001\002\000\004" +
    "\002\001\001\002\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\024\000\006\002\004\003\003\001\001\000\006\002" +
    "\025\003\003\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\004\010\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\004\023\001\001\000\004\004\022\001\001\000" +
    "\004\004\021\001\001\000\004\004\020\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintax$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintax$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




    private Symbol s;
    
    /**
     * M??todo al que se llama autom??ticamente ante alg??n error sintactico.
     **/
    public void syntax_error(Symbol s){
        System.out.println("Error Sint??ctico en la L??nea " + (s.left) +
        " Columna "+s.right+ ". No se esperaba este componente: " +s.value+"."); 
        this.s = s;
    }

    /**
     * M??todo al que se llama autom??ticamente ante alg??n error sint??ctico 
     * en el que ya no es posible una recuperaci??n de errores.
     **/ 
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{ 
        System.out.println("Error s??ntactico irrecuperable en la L??nea " + 
        (s.left)+ " Columna "+s.right+". Componente " + s.value + 
        " no reconocido."); 
    }  

    public Symbol getS(){
        return this.s;
    }



    //ACCIONES********
    
    private ArrayList<Declaracion> declaraciones = new ArrayList<>();

    private void agregarDeclaracion(String identificador, Double valor){
        String valorFinal = String.valueOf(valor);
        Declaracion declaracion = new Declaracion(identificador, valorFinal);
        declaraciones.add(declaracion);
    }
    
    public ArrayList<Declaracion> getDeclaraciones(){
        return this.declaraciones;
    }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Sintax$actions {
  private final Sintax parser;

  /** Constructor */
  CUP$Sintax$actions(Sintax parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Sintax$do_action_part00000000(
    int                        CUP$Sintax$act_num,
    java_cup.runtime.lr_parser CUP$Sintax$parser,
    java.util.Stack            CUP$Sintax$stack,
    int                        CUP$Sintax$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintax$result;

      /* select the action based on the action number */
      switch (CUP$Sintax$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		RESULT = start_val;
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintax$parser.done_parsing();
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= ASIGNACION INICIO 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INICIO ::= ASIGNACION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // ASIGNACION ::= INT IDENTIFICADOR EQUAL EXPR SEMI_COLON 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)).value;
		int exprleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int exprright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Double expr = (Double)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		agregarDeclaracion(i,expr);  
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("ASIGNACION",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // EXPR ::= EXPR PLUS EXPR 
            {
              Double RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).right;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		RESULT=e1+e2; 
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPR",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // EXPR ::= EXPR LESS EXPR 
            {
              Double RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).right;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		RESULT=e1-e2; 
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPR",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // EXPR ::= EXPR MULT EXPR 
            {
              Double RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).right;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		RESULT=e1*e2; 
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPR",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // EXPR ::= EXPR DIV EXPR 
            {
              Double RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).right;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		RESULT=e1/e2; 
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPR",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // EXPR ::= DIGIT 
            {
              Double RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		String d = (String)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		RESULT=new Double(d); 
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPR",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // EXPR ::= DECIMAL 
            {
              Double RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		String f = (String)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		RESULT=new Double(f); 
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPR",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Sintax$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Sintax$do_action(
    int                        CUP$Sintax$act_num,
    java_cup.runtime.lr_parser CUP$Sintax$parser,
    java.util.Stack            CUP$Sintax$stack,
    int                        CUP$Sintax$top)
    throws java.lang.Exception
    {
              return CUP$Sintax$do_action_part00000000(
                               CUP$Sintax$act_num,
                               CUP$Sintax$parser,
                               CUP$Sintax$stack,
                               CUP$Sintax$top);
    }
}

}
