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
      case LEX_MJAVA.token_plus : // 16080
        regle51 () ;
      break ;
      case LEX_MJAVA.token_moins : // 16081
        regle51 () ;
      break ;
      case LEX_MJAVA.token_ou : // 16082
        regle51 () ;
      break ;
      case LEX_MJAVA.token_inf : // 16074
        regle52 () ;
      break ;
      case LEX_MJAVA.token_infeg : // 16075
        regle52 () ;
      break ;
      case LEX_MJAVA.token_sup : // 16076
        regle52 () ;
      break ;
      case LEX_MJAVA.token_supeg : // 16077
        regle52 () ;
      break ;
      case LEX_MJAVA.token_eg : // 16078
        regle52 () ;
      break ;
      case LEX_MJAVA.token_neg : // 16079
        regle52 () ;
      break ;
      case LEX_MJAVA.token_affect : // 16061
        regle52 () ;
      break ;
      case LEX_MJAVA.token_virg : // 16058
        regle52 () ;
      break ;
      case LEX_MJAVA.token_pv : // 16059
        regle52 () ;
      break ;
      case LEX_MJAVA.token_parf : // 16053
        regle52 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
