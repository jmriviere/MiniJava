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
      case LEX_MJAVA.token_sinon : // 169
        regle35 () ;
      break ;
      case LEX_MJAVA.token_int : // 171
        regle36 () ;
      break ;
      case LEX_MJAVA.token_bool : // 172
        regle36 () ;
      break ;
      case LEX_MJAVA.token_ident : // 197
        regle36 () ;
      break ;
      case LEX_MJAVA.token_entier : // 196
        regle36 () ;
      break ;
      case LEX_MJAVA.token_vrai : // 194
        regle36 () ;
      break ;
      case LEX_MJAVA.token_faux : // 195
        regle36 () ;
      break ;
      case LEX_MJAVA.token_plus : // 186
        regle36 () ;
      break ;
      case LEX_MJAVA.token_moins : // 187
        regle36 () ;
      break ;
      case LEX_MJAVA.token_non : // 193
        regle36 () ;
      break ;
      case LEX_MJAVA.token_null : // 179
        regle36 () ;
      break ;
      case LEX_MJAVA.token_paro : // 158
        regle36 () ;
      break ;
      case LEX_MJAVA.token_nouveau : // 178
        regle36 () ;
      break ;
      case LEX_MJAVA.token_aco : // 160
        regle36 () ;
      break ;
      case LEX_MJAVA.token_si : // 168
        regle36 () ;
      break ;
      case LEX_MJAVA.token_retour : // 177
        regle36 () ;
      break ;
      case LEX_MJAVA.token_acf : // 161
        regle36 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
