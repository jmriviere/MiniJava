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
  TDS att_tds;
  LEX_MJAVA att_scanner;
  private void regle30() throws Exception {

    //declaration
    S_INST_MJAVA x_2 = new S_INST_MJAVA(scanner) ;
    S_INSTS_MJAVA x_3 = new S_INSTS_MJAVA(scanner) ;
    //appel
      action_auto_inh_30(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
  }
  private void regle29() throws Exception {

    //declaration
    //appel
  }
private void action_auto_inh_30(S_INST_MJAVA x_2, S_INSTS_MJAVA x_3) throws Exception {
try {
// instructions
x_2.att_tds=this.att_tds;
x_3.att_tds=this.att_tds;
}catch(RuntimeException e) {		//e.printStackTrace();
       scanner._interrompre(IProblem.Internal, scanner.getBeginLine(), ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,e.getStackTrace());
	}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_acf : // 94
        regle29 () ;
      break ;
      case LEX_MJAVA.token_int : // 104
        regle30 () ;
      break ;
      case LEX_MJAVA.token_bool : // 105
        regle30 () ;
      break ;
      case LEX_MJAVA.token_ident : // 130
        regle30 () ;
      break ;
      case LEX_MJAVA.token_entier : // 129
        regle30 () ;
      break ;
      case LEX_MJAVA.token_vrai : // 127
        regle30 () ;
      break ;
      case LEX_MJAVA.token_faux : // 128
        regle30 () ;
      break ;
      case LEX_MJAVA.token_plus : // 119
        regle30 () ;
      break ;
      case LEX_MJAVA.token_moins : // 120
        regle30 () ;
      break ;
      case LEX_MJAVA.token_non : // 126
        regle30 () ;
      break ;
      case LEX_MJAVA.token_null : // 112
        regle30 () ;
      break ;
      case LEX_MJAVA.token_paro : // 91
        regle30 () ;
      break ;
      case LEX_MJAVA.token_nouveau : // 111
        regle30 () ;
      break ;
      case LEX_MJAVA.token_aco : // 93
        regle30 () ;
      break ;
      case LEX_MJAVA.token_si : // 101
        regle30 () ;
      break ;
      case LEX_MJAVA.token_retour : // 110
        regle30 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
