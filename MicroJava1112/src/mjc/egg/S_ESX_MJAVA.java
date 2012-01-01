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
      case LEX_MJAVA.token_plus : // 54816
        regle51 () ;
      break ;
      case LEX_MJAVA.token_moins : // 54817
        regle51 () ;
      break ;
      case LEX_MJAVA.token_ou : // 54818
        regle51 () ;
      break ;
      case LEX_MJAVA.token_inf : // 54810
        regle52 () ;
      break ;
      case LEX_MJAVA.token_infeg : // 54811
        regle52 () ;
      break ;
      case LEX_MJAVA.token_sup : // 54812
        regle52 () ;
      break ;
      case LEX_MJAVA.token_supeg : // 54813
        regle52 () ;
      break ;
      case LEX_MJAVA.token_eg : // 54814
        regle52 () ;
      break ;
      case LEX_MJAVA.token_neg : // 54815
        regle52 () ;
      break ;
      case LEX_MJAVA.token_affect : // 54797
        regle52 () ;
      break ;
      case LEX_MJAVA.token_virg : // 54794
        regle52 () ;
      break ;
      case LEX_MJAVA.token_pv : // 54795
        regle52 () ;
      break ;
      case LEX_MJAVA.token_parf : // 54789
        regle52 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
