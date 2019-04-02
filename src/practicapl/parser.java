
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Tue Apr 02 12:07:00 CEST 2019
//----------------------------------------------------

package practicapl;

import java.io.PrintWriter;
import java_cup.runtime.*;


/** CUP v0.11a beta 20060608 generated parser.
  * @version Tue Apr 02 12:07:00 CEST 2019
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\062\000\002\002\007\000\002\002\004\000\002\003" +
    "\006\000\002\004\002\000\002\004\004\000\002\005\003" +
    "\000\002\005\004\000\002\006\003\000\002\006\003\000" +
    "\002\006\003\000\002\006\003\000\002\010\004\000\002" +
    "\014\006\000\002\014\007\000\002\015\003\000\002\015" +
    "\003\000\002\015\003\000\002\011\005\000\002\016\005" +
    "\000\002\016\007\000\002\017\003\000\002\017\005\000" +
    "\002\012\010\000\002\013\012\000\002\021\002\000\002" +
    "\021\005\000\002\022\005\000\002\022\007\000\002\020" +
    "\003\000\002\020\003\000\002\007\004\000\002\007\004" +
    "\000\002\023\005\000\002\025\003\000\002\026\005\000" +
    "\002\026\003\000\002\027\003\000\002\031\003\000\002" +
    "\031\003\000\002\031\003\000\002\031\003\000\002\031" +
    "\003\000\002\030\003\000\002\030\005\000\002\030\004" +
    "\000\002\032\002\000\002\032\005\000\002\033\003\000" +
    "\002\033\005\000\002\024\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\142\000\004\010\004\001\002\000\004\004\007\001" +
    "\002\000\004\002\006\001\002\000\004\002\000\001\002" +
    "\000\004\011\010\001\002\000\014\013\ufffe\015\ufffe\017" +
    "\ufffe\022\ufffe\023\ufffe\001\002\000\014\013\016\015\021" +
    "\017\025\022\014\023\017\001\002\000\004\012\013\001" +
    "\002\000\004\002\001\001\002\000\004\004\140\001\002" +
    "\000\014\013\ufffd\015\ufffd\017\ufffd\022\ufffd\023\ufffd\001" +
    "\002\000\004\004\100\001\002\000\004\004\057\001\002" +
    "\000\014\013\ufff8\015\ufff8\017\ufff8\022\ufff8\023\ufff8\001" +
    "\002\000\004\004\043\001\002\000\014\013\ufff7\015\ufff7" +
    "\017\ufff7\022\ufff7\023\ufff7\001\002\000\014\013\ufffa\015" +
    "\ufffa\017\ufffa\022\ufffa\023\ufffa\001\002\000\014\013\ufff9" +
    "\015\ufff9\017\ufff9\022\ufff9\023\ufff9\001\002\000\004\004" +
    "\027\001\002\000\004\020\041\001\002\000\006\020\uffed" +
    "\021\037\001\002\000\004\011\031\001\002\000\016\004" +
    "\027\013\ufff0\015\ufff0\017\ufff0\022\ufff0\023\ufff0\001\002" +
    "\000\004\020\033\001\002\000\006\026\034\027\036\001" +
    "\002\000\006\011\uffe5\025\uffe5\001\002\000\004\011\uffee" +
    "\001\002\000\006\011\uffe4\025\uffe4\001\002\000\004\004" +
    "\027\001\002\000\004\020\uffec\001\002\000\006\026\034" +
    "\027\036\001\002\000\004\011\uffef\001\002\000\004\016" +
    "\054\001\002\000\016\004\045\013\ufff6\015\ufff6\017\ufff6" +
    "\022\ufff6\023\ufff6\001\002\000\004\016\046\001\002\000" +
    "\010\005\051\006\052\007\047\001\002\000\022\011\ufff1" +
    "\021\ufff1\025\ufff1\031\ufff1\032\ufff1\033\ufff1\034\ufff1\035" +
    "\ufff1\001\002\000\004\011\053\001\002\000\022\011\ufff3" +
    "\021\ufff3\025\ufff3\031\ufff3\032\ufff3\033\ufff3\034\ufff3\035" +
    "\ufff3\001\002\000\022\011\ufff2\021\ufff2\025\ufff2\031\ufff2" +
    "\032\ufff2\033\ufff2\034\ufff2\035\ufff2\001\002\000\016\004" +
    "\ufff4\013\ufff4\015\ufff4\017\ufff4\022\ufff4\023\ufff4\001\002" +
    "\000\010\005\051\006\052\007\047\001\002\000\004\011" +
    "\056\001\002\000\016\004\ufff5\013\ufff5\015\ufff5\017\ufff5" +
    "\022\ufff5\023\ufff5\001\002\000\006\020\uffe9\024\060\001" +
    "\002\000\004\004\027\001\002\000\004\020\062\001\002" +
    "\000\006\026\034\027\036\001\002\000\004\011\064\001" +
    "\002\000\014\013\ufffe\015\ufffe\017\ufffe\022\ufffe\023\ufffe" +
    "\001\002\000\004\011\066\001\002\000\014\013\uffea\015" +
    "\uffea\017\uffea\022\uffea\023\uffea\001\002\000\004\025\075" +
    "\001\002\000\004\020\071\001\002\000\006\026\034\027" +
    "\036\001\002\000\006\011\073\025\uffe7\001\002\000\004" +
    "\004\027\001\002\000\004\025\uffe6\001\002\000\006\011" +
    "\uffe8\020\uffe8\001\002\000\004\030\136\001\002\000\004" +
    "\011\135\001\002\000\010\011\uffd4\024\107\030\uffe0\001" +
    "\002\000\006\004\ufffc\014\ufffc\001\002\000\006\004\100" +
    "\014\105\001\002\000\004\011\104\001\002\000\006\004" +
    "\uffe3\014\uffe3\001\002\000\006\011\uffff\012\uffff\001\002" +
    "\000\006\004\ufffb\014\ufffb\001\002\000\014\004\112\005" +
    "\051\006\052\007\047\024\115\001\002\000\004\011\uffd0" +
    "\001\002\000\022\011\uffde\021\uffde\025\uffde\031\uffde\032" +
    "\uffde\033\uffde\034\uffde\035\uffde\001\002\000\024\011\uffd4" +
    "\021\uffd4\024\107\025\uffd4\031\uffd4\032\uffd4\033\uffd4\034" +
    "\uffd4\035\uffd4\001\002\000\022\011\uffd7\021\uffd7\025\uffd7" +
    "\031\uffd7\032\uffd7\033\uffd7\034\uffd7\035\uffd7\001\002\000" +
    "\004\025\133\001\002\000\014\004\112\005\051\006\052" +
    "\007\047\024\115\001\002\000\020\021\117\025\uffd2\031" +
    "\125\032\122\033\124\034\126\035\121\001\002\000\014" +
    "\004\112\005\051\006\052\007\047\024\115\001\002\000" +
    "\014\004\112\005\051\006\052\007\047\024\115\001\002" +
    "\000\014\004\uffd8\005\uffd8\006\uffd8\007\uffd8\024\uffd8\001" +
    "\002\000\014\004\uffdb\005\uffdb\006\uffdb\007\uffdb\024\uffdb" +
    "\001\002\000\014\004\uffdd\005\uffdd\006\uffdd\007\uffdd\024" +
    "\uffdd\001\002\000\014\004\uffda\005\uffda\006\uffda\007\uffda" +
    "\024\uffda\001\002\000\014\004\uffdc\005\uffdc\006\uffdc\007" +
    "\uffdc\024\uffdc\001\002\000\014\004\uffd9\005\uffd9\006\uffd9" +
    "\007\uffd9\024\uffd9\001\002\000\022\011\uffdf\021\uffdf\025" +
    "\uffdf\031\125\032\122\033\124\034\126\035\121\001\002" +
    "\000\004\025\uffd1\001\002\000\016\025\132\031\125\032" +
    "\122\033\124\034\126\035\121\001\002\000\022\011\uffd6" +
    "\021\uffd6\025\uffd6\031\uffd6\032\uffd6\033\uffd6\034\uffd6\035" +
    "\uffd6\001\002\000\022\011\uffd3\021\uffd3\025\uffd3\031\uffd3" +
    "\032\uffd3\033\uffd3\034\uffd3\035\uffd3\001\002\000\022\011" +
    "\uffd5\021\uffd5\025\uffd5\031\uffd5\032\uffd5\033\uffd5\034\uffd5" +
    "\035\uffd5\001\002\000\006\004\uffe2\014\uffe2\001\002\000" +
    "\014\004\112\005\051\006\052\007\047\024\115\001\002" +
    "\000\016\011\uffe1\031\125\032\122\033\124\034\126\035" +
    "\121\001\002\000\006\011\uffe9\024\060\001\002\000\004" +
    "\011\142\001\002\000\014\013\ufffe\015\ufffe\017\ufffe\022" +
    "\ufffe\023\ufffe\001\002\000\004\011\144\001\002\000\014" +
    "\013\uffeb\015\uffeb\017\uffeb\022\uffeb\023\uffeb\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\142\000\004\002\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\003\011\004\010\001\001\000\014\006\014\010\022\011" +
    "\023\012\017\013\021\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\014\005" +
    "\101\007\100\023\102\024\076\025\075\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\014\043\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\016\027\017\025\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\017\031\001\001\000\002" +
    "\001\001\000\004\020\034\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\017\037\001\001" +
    "\000\002\001\001\000\004\020\041\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\015\047\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\015\054\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\021\060\001\001\000\006\017\067\022\066" +
    "\001\001\000\002\001\001\000\004\020\062\001\001\000" +
    "\002\001\001\000\006\003\064\004\010\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\020\071\001\001\000\002\001\001\000\006" +
    "\017\067\022\073\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\032\107" +
    "\001\001\000\002\001\001\000\012\007\105\023\102\024" +
    "\076\025\075\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\012\015\112\026" +
    "\115\030\110\033\113\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\032\133\001\001\000\002\001\001\000" +
    "\002\001\001\000\010\015\112\026\130\030\110\001\001" +
    "\000\006\027\117\031\122\001\001\000\012\015\112\026" +
    "\115\030\110\033\127\001\001\000\010\015\112\026\126" +
    "\030\110\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\027\117\031\122\001\001\000\002\001" +
    "\001\000\006\027\117\031\122\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\010\015\112\026\136\030\110\001\001\000\006\027\117" +
    "\031\122\001\001\000\004\021\140\001\001\000\002\001" +
    "\001\000\006\003\142\004\010\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
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
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


 
    public static PrintWriter writer = null; 
    public void syntax_error(Symbol cur_token) {            
        if(cur_token!=null){
            if (cur_token.sym == EOF_sym()){
                report_error("Fin de archivo inesperado", null);
            }
            else if (cur_token.value == null){
                report_error("ERROR en el Simbolo n: "+cur_token.sym+"\n(Linea " + cur_token.left + " / Columna "+cur_token.right+")\n", null);
            }
            else{
                report_error( "ERROR_SINTACTICO(" + cur_token.left + " / "+cur_token.right+"): Puede faltar ; .Mala construccion de la frase cerca de: " + cur_token.value.toString(), null);
            }
        }else{
            System.out.println("token indefinido");
        }
        
    }

    public void unrecovered_syntax_error(Symbol cur_token) throws Exception {
        System.out.println("ERRORES IRRECUPERABLES DETECTADOS");
        if(cur_token==null){
            System.out.println("token indefinido");
        }else{
            if(cur_token.value==null){
                report_error("ERR_SIN(" + ((cur_token.left)+1) + " / "+((cur_token.right)+1)+"): Mala construccion de la frase cerca de: ", null);
            }else{
                report_error( "ERROR_SINTACTICO(" + cur_token.left + " / "+cur_token.right+"): Puede faltar ; .Mala construccion de la frase cerca de: " + cur_token.value.toString(), null);
            }
          }
         report_fatal_error("No es posible recuperarse de los errores encontrados.", null);
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 49: // PROC_CALL ::= identifier SUBPARAMLIST 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PROC_CALL",18, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // EXPLIST ::= EXP comma EXPLIST 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPLIST",25, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // EXPLIST ::= EXP 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPLIST",25, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // SUBPARAMLIST ::= openParenthesis EXPLIST closeParenthesis 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("SUBPARAMLIST",24, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // SUBPARAMLIST ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("SUBPARAMLIST",24, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // FACTOR ::= identifier SUBPARAMLIST 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("FACTOR",22, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // FACTOR ::= openParenthesis EXP closeParenthesis 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("FACTOR",22, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // FACTOR ::= SIMPVALUE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("FACTOR",22, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // OPARIT ::= mod 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("OPARIT",23, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // OPARIT ::= div 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("OPARIT",23, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // OPARIT ::= multiplication 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("OPARIT",23, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // OPARIT ::= minus 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("OPARIT",23, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // OPARIT ::= plus 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("OPARIT",23, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // OP ::= OPARIT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("OP",21, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // EXP ::= FACTOR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXP",20, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // EXP ::= EXP OP EXP 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXP",20, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // ID ::= identifier 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ID",19, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // ASIG ::= ID assig EXP 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ASIG",17, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // SENT ::= PROC_CALL semicolon 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("SENT",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // SENT ::= ASIG semicolon 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("SENT",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // TBAS ::= REAL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TBAS",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // TBAS ::= INTEGER 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TBAS",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // FORMAL_PARAM ::= VARLIST colon TBAS semicolon FORMAL_PARAM 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("FORMAL_PARAM",16, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // FORMAL_PARAM ::= VARLIST colon TBAS 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("FORMAL_PARAM",16, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // FORMAL_PARAMLIST ::= openParenthesis FORMAL_PARAM closeParenthesis 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("FORMAL_PARAMLIST",15, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // FORMAL_PARAMLIST ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("FORMAL_PARAMLIST",15, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // DEFFUN ::= function identifier FORMAL_PARAMLIST colon TBAS semicolon BLQ semicolon 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("DEFFUN",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // DEFPROC ::= procedure identifier FORMAL_PARAMLIST semicolon BLQ semicolon 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("DEFPROC",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // VARLIST ::= identifier comma VARLIST 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("VARLIST",13, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // VARLIST ::= identifier 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("VARLIST",13, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // DEFVARLIST ::= DEFVARLIST semicolon VARLIST colon TBAS 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("DEFVARLIST",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // DEFVARLIST ::= VARLIST colon TBAS 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("DEFVARLIST",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // DEFVAR ::= var DEFVARLIST semicolon 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("DEFVAR",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // SIMPVALUE ::= string_const 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("SIMPVALUE",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // SIMPVALUE ::= numeric_real_const 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("SIMPVALUE",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // SIMPVALUE ::= numeric_integer_const 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("SIMPVALUE",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // CTELIST ::= CTELIST identifier equal SIMPVALUE semicolon 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CTELIST",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // CTELIST ::= identifier equal SIMPVALUE semicolon 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CTELIST",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // DEFCTE ::= constant CTELIST 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("DEFCTE",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // DCL ::= DEFFUN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("DCL",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // DCL ::= DEFPROC 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("DCL",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // DCL ::= DEFVAR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("DCL",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // DCL ::= DEFCTE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("DCL",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // SENTLIST ::= SENTLIST SENT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("SENTLIST",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // SENTLIST ::= SENT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("SENTLIST",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // DCLLIST ::= DCLLIST DCL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("DCLLIST",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // DCLLIST ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("DCLLIST",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // BLQ ::= DCLLIST begin SENTLIST end 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("BLQ",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= PRG EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // PRG ::= program identifier semicolon BLQ dot 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PRG",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

