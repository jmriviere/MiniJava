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
      case LEX_MJAVA.token_int : // 54801
        regle31 () ;
      break ;
      case LEX_MJAVA.token_bool : // 54802
        regle31 () ;
      break ;
      case LEX_MJAVA.token_ident : // 54827
        scanner.lit ( 2 ) ;
        switch ( scanner.fenetre[1].code ) {
          case LEX_MJAVA.token_ident : // 54827
            regle31 () ;
          break ;
          case LEX_MJAVA.token_pt : // 54796
            regle32 () ;
          break ;
          case LEX_MJAVA.token_paro : // 54788
            regle32 () ;
          break ;
          case LEX_MJAVA.token_mult : // 54819
            regle32 () ;
          break ;
          case LEX_MJAVA.token_div : // 54820
            regle32 () ;
          break ;
          case LEX_MJAVA.token_mod : // 54821
            regle32 () ;
          break ;
          case LEX_MJAVA.token_et : // 54822
            regle32 () ;
          break ;
          case LEX_MJAVA.token_plus : // 54816
            regle32 () ;
          break ;
          case LEX_MJAVA.token_moins : // 54817
            regle32 () ;
          break ;
          case LEX_MJAVA.token_ou : // 54818
            regle32 () ;
          break ;
          case LEX_MJAVA.token_inf : // 54810
            regle32 () ;
          break ;
          case LEX_MJAVA.token_infeg : // 54811
            regle32 () ;
          break ;
          case LEX_MJAVA.token_sup : // 54812
            regle32 () ;
          break ;
          case LEX_MJAVA.token_supeg : // 54813
            regle32 () ;
          break ;
          case LEX_MJAVA.token_eg : // 54814
            regle32 () ;
          break ;
          case LEX_MJAVA.token_neg : // 54815
            regle32 () ;
          break ;
          case LEX_MJAVA.token_affect : // 54797
            regle32 () ;
          break ;
          case LEX_MJAVA.token_pv : // 54795
            regle32 () ;
          break ;
          default :
                   scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[1].getNom()});
scanner.accepter_sucre(LEX_MJAVA.token_ident);
        }
      break ;
      case LEX_MJAVA.token_entier : // 54826
        regle32 () ;
      break ;
      case LEX_MJAVA.token_vrai : // 54824
        regle32 () ;
      break ;
      case LEX_MJAVA.token_faux : // 54825
        regle32 () ;
      break ;
      case LEX_MJAVA.token_plus : // 54816
        regle32 () ;
      break ;
      case LEX_MJAVA.token_moins : // 54817
        regle32 () ;
      break ;
      case LEX_MJAVA.token_non : // 54823
        regle32 () ;
      break ;
      case LEX_MJAVA.token_null : // 54809
        regle32 () ;
      break ;
      case LEX_MJAVA.token_paro : // 54788
        regle32 () ;
      break ;
      case LEX_MJAVA.token_nouveau : // 54808
        regle32 () ;
      break ;
      case LEX_MJAVA.token_aco : // 54790
        regle33 () ;
      break ;
      case LEX_MJAVA.token_si : // 54798
        regle34 () ;
      break ;
      case LEX_MJAVA.token_retour : // 54807
        regle37 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
