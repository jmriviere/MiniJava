package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.messages.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_TX_MJAVA {
LEX_MJAVA scanner;
  S_TX_MJAVA() {
    }
  S_TX_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle58() throws Exception {

    //declaration
    //appel
  }
  private void regle57() throws Exception {

    //declaration
    S_OPMUL_MJAVA x_2 = new S_OPMUL_MJAVA(scanner) ;
    S_F_MJAVA x_3 = new S_F_MJAVA(scanner) ;
    S_TX_MJAVA x_4 = new S_TX_MJAVA(scanner) ;
    //appel
    x_2.analyser() ;
    x_3.analyser() ;
    x_4.analyser() ;
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_mult : // 189
        regle57 () ;
      break ;
      case LEX_MJAVA.token_div : // 190
        regle57 () ;
      break ;
      case LEX_MJAVA.token_mod : // 191
        regle57 () ;
      break ;
      case LEX_MJAVA.token_et : // 192
        regle57 () ;
      break ;
      case LEX_MJAVA.token_plus : // 186
        regle58 () ;
      break ;
      case LEX_MJAVA.token_moins : // 187
        regle58 () ;
      break ;
      case LEX_MJAVA.token_ou : // 188
        regle58 () ;
      break ;
      case LEX_MJAVA.token_inf : // 180
        regle58 () ;
      break ;
      case LEX_MJAVA.token_infeg : // 181
        regle58 () ;
      break ;
      case LEX_MJAVA.token_sup : // 182
        regle58 () ;
      break ;
      case LEX_MJAVA.token_supeg : // 183
        regle58 () ;
      break ;
      case LEX_MJAVA.token_eg : // 184
        regle58 () ;
      break ;
      case LEX_MJAVA.token_neg : // 185
        regle58 () ;
      break ;
      case LEX_MJAVA.token_affect : // 167
        regle58 () ;
      break ;
      case LEX_MJAVA.token_virg : // 164
        regle58 () ;
      break ;
      case LEX_MJAVA.token_pv : // 165
        regle58 () ;
      break ;
      case LEX_MJAVA.token_parf : // 159
        regle58 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
