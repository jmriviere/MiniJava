package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.messages.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_SIX_MJAVA {
LEX_MJAVA scanner;
  S_SIX_MJAVA() {
    }
  S_SIX_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle36() throws Exception {

    //declaration
    //appel
  }
  private void regle35() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_BLOC_MJAVA x_3 = new S_BLOC_MJAVA(scanner) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_sinon);
    x_3.analyser() ;
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_sinon : // 54799
        regle35 () ;
      break ;
      case LEX_MJAVA.token_int : // 54801
        regle36 () ;
      break ;
      case LEX_MJAVA.token_bool : // 54802
        regle36 () ;
      break ;
      case LEX_MJAVA.token_ident : // 54827
        regle36 () ;
      break ;
      case LEX_MJAVA.token_entier : // 54826
        regle36 () ;
      break ;
      case LEX_MJAVA.token_vrai : // 54824
        regle36 () ;
      break ;
      case LEX_MJAVA.token_faux : // 54825
        regle36 () ;
      break ;
      case LEX_MJAVA.token_plus : // 54816
        regle36 () ;
      break ;
      case LEX_MJAVA.token_moins : // 54817
        regle36 () ;
      break ;
      case LEX_MJAVA.token_non : // 54823
        regle36 () ;
      break ;
      case LEX_MJAVA.token_null : // 54809
        regle36 () ;
      break ;
      case LEX_MJAVA.token_paro : // 54788
        regle36 () ;
      break ;
      case LEX_MJAVA.token_nouveau : // 54808
        regle36 () ;
      break ;
      case LEX_MJAVA.token_aco : // 54790
        regle36 () ;
      break ;
      case LEX_MJAVA.token_si : // 54798
        regle36 () ;
      break ;
      case LEX_MJAVA.token_retour : // 54807
        regle36 () ;
      break ;
      case LEX_MJAVA.token_acf : // 54791
        regle36 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
