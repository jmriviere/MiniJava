package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.messages.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_ESX_MJAVA {
LEX_MJAVA scanner;
  S_ESX_MJAVA() {
    }
  S_ESX_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle51() throws Exception {

    //declaration
    S_OPADD_MJAVA x_2 = new S_OPADD_MJAVA(scanner) ;
    S_T_MJAVA x_3 = new S_T_MJAVA(scanner) ;
    S_ESX_MJAVA x_4 = new S_ESX_MJAVA(scanner) ;
    //appel
    x_2.analyser() ;
    x_3.analyser() ;
    x_4.analyser() ;
  }
  private void regle52() throws Exception {

    //declaration
    //appel
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_plus : // 42
        regle51 () ;
      break ;
      case LEX_MJAVA.token_moins : // 43
        regle51 () ;
      break ;
      case LEX_MJAVA.token_ou : // 44
        regle51 () ;
      break ;
      case LEX_MJAVA.token_inf : // 36
        regle52 () ;
      break ;
      case LEX_MJAVA.token_infeg : // 37
        regle52 () ;
      break ;
      case LEX_MJAVA.token_sup : // 38
        regle52 () ;
      break ;
      case LEX_MJAVA.token_supeg : // 39
        regle52 () ;
      break ;
      case LEX_MJAVA.token_eg : // 40
        regle52 () ;
      break ;
      case LEX_MJAVA.token_neg : // 41
        regle52 () ;
      break ;
      case LEX_MJAVA.token_affect : // 23
        regle52 () ;
      break ;
      case LEX_MJAVA.token_virg : // 20
        regle52 () ;
      break ;
      case LEX_MJAVA.token_pv : // 21
        regle52 () ;
      break ;
      case LEX_MJAVA.token_parf : // 15
        regle52 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
