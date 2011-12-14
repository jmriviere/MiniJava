package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.messages.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_INST_MJAVA {
LEX_MJAVA scanner;
  S_INST_MJAVA() {
    }
  S_INST_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle37() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    S_E_MJAVA x_3 = new S_E_MJAVA(scanner) ;
    T_MJAVA x_4 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_retour);
    x_3.analyser() ;
    x_4.analyser(LEX_MJAVA.token_pv);
  }
  private void regle31() throws Exception {

    //declaration
    S_TYPE_MJAVA x_2 = new S_TYPE_MJAVA(scanner) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    S_AFFX_MJAVA x_4 = new S_AFFX_MJAVA(scanner) ;
    T_MJAVA x_5 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser() ;
    x_3.analyser(LEX_MJAVA.token_ident);
    x_4.analyser() ;
    x_5.analyser(LEX_MJAVA.token_pv);
  }
  private void regle32() throws Exception {

    //declaration
    S_E_MJAVA x_2 = new S_E_MJAVA(scanner) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    //appel
    x_2.analyser() ;
    x_3.analyser(LEX_MJAVA.token_pv);
  }
  private void regle33() throws Exception {

    //declaration
    S_BLOC_MJAVA x_2 = new S_BLOC_MJAVA(scanner) ;
    //appel
    x_2.analyser() ;
  }
  private void regle34() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    S_E_MJAVA x_4 = new S_E_MJAVA(scanner) ;
    T_MJAVA x_5 = new T_MJAVA(scanner ) ;
    S_BLOC_MJAVA x_6 = new S_BLOC_MJAVA(scanner) ;
    S_SIX_MJAVA x_7 = new S_SIX_MJAVA(scanner) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_si);
    x_3.analyser(LEX_MJAVA.token_paro);
    x_4.analyser() ;
    x_5.analyser(LEX_MJAVA.token_parf);
    x_6.analyser() ;
    x_7.analyser() ;
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_int : // 171
        regle31 () ;
      break ;
      case LEX_MJAVA.token_bool : // 172
        regle31 () ;
      break ;
      case LEX_MJAVA.token_ident : // 197
        scanner.lit ( 2 ) ;
        switch ( scanner.fenetre[1].code ) {
          case LEX_MJAVA.token_ident : // 197
            regle31 () ;
          break ;
          case LEX_MJAVA.token_pt : // 166
            regle32 () ;
          break ;
          case LEX_MJAVA.token_paro : // 158
            regle32 () ;
          break ;
          case LEX_MJAVA.token_mult : // 189
            regle32 () ;
          break ;
          case LEX_MJAVA.token_div : // 190
            regle32 () ;
          break ;
          case LEX_MJAVA.token_mod : // 191
            regle32 () ;
          break ;
          case LEX_MJAVA.token_et : // 192
            regle32 () ;
          break ;
          case LEX_MJAVA.token_plus : // 186
            regle32 () ;
          break ;
          case LEX_MJAVA.token_moins : // 187
            regle32 () ;
          break ;
          case LEX_MJAVA.token_ou : // 188
            regle32 () ;
          break ;
          case LEX_MJAVA.token_inf : // 180
            regle32 () ;
          break ;
          case LEX_MJAVA.token_infeg : // 181
            regle32 () ;
          break ;
          case LEX_MJAVA.token_sup : // 182
            regle32 () ;
          break ;
          case LEX_MJAVA.token_supeg : // 183
            regle32 () ;
          break ;
          case LEX_MJAVA.token_eg : // 184
            regle32 () ;
          break ;
          case LEX_MJAVA.token_neg : // 185
            regle32 () ;
          break ;
          case LEX_MJAVA.token_affect : // 167
            regle32 () ;
          break ;
          case LEX_MJAVA.token_pv : // 165
            regle32 () ;
          break ;
          default :
                   scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[1].getNom()});
scanner.accepter_sucre(LEX_MJAVA.token_ident);
        }
      break ;
      case LEX_MJAVA.token_entier : // 196
        regle32 () ;
      break ;
      case LEX_MJAVA.token_vrai : // 194
        regle32 () ;
      break ;
      case LEX_MJAVA.token_faux : // 195
        regle32 () ;
      break ;
      case LEX_MJAVA.token_plus : // 186
        regle32 () ;
      break ;
      case LEX_MJAVA.token_moins : // 187
        regle32 () ;
      break ;
      case LEX_MJAVA.token_non : // 193
        regle32 () ;
      break ;
      case LEX_MJAVA.token_null : // 179
        regle32 () ;
      break ;
      case LEX_MJAVA.token_paro : // 158
        regle32 () ;
      break ;
      case LEX_MJAVA.token_nouveau : // 178
        regle32 () ;
      break ;
      case LEX_MJAVA.token_aco : // 160
        regle33 () ;
      break ;
      case LEX_MJAVA.token_si : // 168
        regle34 () ;
      break ;
      case LEX_MJAVA.token_retour : // 177
        regle37 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
