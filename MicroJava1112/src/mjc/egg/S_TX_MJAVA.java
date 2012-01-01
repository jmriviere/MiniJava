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
      case LEX_MJAVA.token_mult : // 54819
        regle57 () ;
      break ;
      case LEX_MJAVA.token_div : // 54820
        regle57 () ;
      break ;
      case LEX_MJAVA.token_mod : // 54821
        regle57 () ;
      break ;
      case LEX_MJAVA.token_et : // 54822
        regle57 () ;
      break ;
      case LEX_MJAVA.token_plus : // 54816
        regle58 () ;
      break ;
      case LEX_MJAVA.token_moins : // 54817
        regle58 () ;
      break ;
      case LEX_MJAVA.token_ou : // 54818
        regle58 () ;
      break ;
      case LEX_MJAVA.token_inf : // 54810
        regle58 () ;
      break ;
      case LEX_MJAVA.token_infeg : // 54811
        regle58 () ;
      break ;
      case LEX_MJAVA.token_sup : // 54812
        regle58 () ;
      break ;
      case LEX_MJAVA.token_supeg : // 54813
        regle58 () ;
      break ;
      case LEX_MJAVA.token_eg : // 54814
        regle58 () ;
      break ;
      case LEX_MJAVA.token_neg : // 54815
        regle58 () ;
      break ;
      case LEX_MJAVA.token_affect : // 54797
        regle58 () ;
      break ;
      case LEX_MJAVA.token_virg : // 54794
        regle58 () ;
      break ;
      case LEX_MJAVA.token_pv : // 54795
        regle58 () ;
      break ;
      case LEX_MJAVA.token_parf : // 54789
        regle58 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
