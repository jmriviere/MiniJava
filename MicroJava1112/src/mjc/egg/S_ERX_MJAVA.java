package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.messages.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_ERX_MJAVA {
LEX_MJAVA scanner;
  S_ERX_MJAVA() {
    }
  S_ERX_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle43() throws Exception {

    //declaration
    S_OPREL_MJAVA x_2 = new S_OPREL_MJAVA(scanner) ;
    S_ES_MJAVA x_3 = new S_ES_MJAVA(scanner) ;
    //appel
    x_2.analyser() ;
    x_3.analyser() ;
  }
  private void regle44() throws Exception {

    //declaration
    //appel
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_inf : // 11483
        regle43 () ;
      break ;
      case LEX_MJAVA.token_infeg : // 11484
        regle43 () ;
      break ;
      case LEX_MJAVA.token_sup : // 11485
        regle43 () ;
      break ;
      case LEX_MJAVA.token_supeg : // 11486
        regle43 () ;
      break ;
      case LEX_MJAVA.token_eg : // 11487
        regle43 () ;
      break ;
      case LEX_MJAVA.token_neg : // 11488
        regle43 () ;
      break ;
      case LEX_MJAVA.token_affect : // 11470
        regle44 () ;
      break ;
      case LEX_MJAVA.token_virg : // 11467
        regle44 () ;
      break ;
      case LEX_MJAVA.token_pv : // 11468
        regle44 () ;
      break ;
      case LEX_MJAVA.token_parf : // 11462
        regle44 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
