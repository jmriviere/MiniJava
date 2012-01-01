package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.messages.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_INSTS_MJAVA {
LEX_MJAVA scanner;
  S_INSTS_MJAVA() {
    }
  S_INSTS_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle30() throws Exception {

    //declaration
    S_INST_MJAVA x_2 = new S_INST_MJAVA(scanner) ;
    S_INSTS_MJAVA x_3 = new S_INSTS_MJAVA(scanner) ;
    //appel
    x_2.analyser() ;
    x_3.analyser() ;
  }
  private void regle29() throws Exception {

    //declaration
    //appel
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_acf : // 54791
        regle29 () ;
      break ;
      case LEX_MJAVA.token_int : // 54801
        regle30 () ;
      break ;
      case LEX_MJAVA.token_bool : // 54802
        regle30 () ;
      break ;
      case LEX_MJAVA.token_ident : // 54827
        regle30 () ;
      break ;
      case LEX_MJAVA.token_entier : // 54826
        regle30 () ;
      break ;
      case LEX_MJAVA.token_vrai : // 54824
        regle30 () ;
      break ;
      case LEX_MJAVA.token_faux : // 54825
        regle30 () ;
      break ;
      case LEX_MJAVA.token_plus : // 54816
        regle30 () ;
      break ;
      case LEX_MJAVA.token_moins : // 54817
        regle30 () ;
      break ;
      case LEX_MJAVA.token_non : // 54823
        regle30 () ;
      break ;
      case LEX_MJAVA.token_null : // 54809
        regle30 () ;
      break ;
      case LEX_MJAVA.token_paro : // 54788
        regle30 () ;
      break ;
      case LEX_MJAVA.token_nouveau : // 54808
        regle30 () ;
      break ;
      case LEX_MJAVA.token_aco : // 54790
        regle30 () ;
      break ;
      case LEX_MJAVA.token_si : // 54798
        regle30 () ;
      break ;
      case LEX_MJAVA.token_retour : // 54807
        regle30 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
