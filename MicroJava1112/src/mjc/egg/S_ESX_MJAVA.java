package mjc.egg;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
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
      case LEX_MJAVA.token_plus : // 1345
        regle51 () ;
      break ;
      case LEX_MJAVA.token_moins : // 1346
        regle51 () ;
      break ;
      case LEX_MJAVA.token_ou : // 1347
        regle51 () ;
      break ;
      case LEX_MJAVA.token_inf : // 1339
        regle52 () ;
      break ;
      case LEX_MJAVA.token_infeg : // 1340
        regle52 () ;
      break ;
      case LEX_MJAVA.token_sup : // 1341
        regle52 () ;
      break ;
      case LEX_MJAVA.token_supeg : // 1342
        regle52 () ;
      break ;
      case LEX_MJAVA.token_eg : // 1343
        regle52 () ;
      break ;
      case LEX_MJAVA.token_neg : // 1344
        regle52 () ;
      break ;
      case LEX_MJAVA.token_affect : // 1326
        regle52 () ;
      break ;
      case LEX_MJAVA.token_virg : // 1323
        regle52 () ;
      break ;
      case LEX_MJAVA.token_pv : // 1324
        regle52 () ;
      break ;
      case LEX_MJAVA.token_parf : // 1318
        regle52 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
