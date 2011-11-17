package mjc.egg;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
public class S_TX_MJAVA {
LEX_MJAVA scanner;
  S_TX_MJAVA() {
    }
  S_TX_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle58() throws Exception {

    //declaration
    //appel
  }
  private void regle57() throws Exception {

    //declaration
    S_OPMUL_MJAVA x_2 = new S_OPMUL_MJAVA(scanner) ;
    S_F_MJAVA x_3 = new S_F_MJAVA(scanner) ;
    S_TX_MJAVA x_4 = new S_TX_MJAVA(scanner) ;
    //appel
    x_2.analyser() ;
    x_3.analyser() ;
    x_4.analyser() ;
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_mult : // 1348
        regle57 () ;
      break ;
      case LEX_MJAVA.token_div : // 1349
        regle57 () ;
      break ;
      case LEX_MJAVA.token_mod : // 1350
        regle57 () ;
      break ;
      case LEX_MJAVA.token_et : // 1351
        regle57 () ;
      break ;
      case LEX_MJAVA.token_plus : // 1345
        regle58 () ;
      break ;
      case LEX_MJAVA.token_moins : // 1346
        regle58 () ;
      break ;
      case LEX_MJAVA.token_ou : // 1347
        regle58 () ;
      break ;
      case LEX_MJAVA.token_inf : // 1339
        regle58 () ;
      break ;
      case LEX_MJAVA.token_infeg : // 1340
        regle58 () ;
      break ;
      case LEX_MJAVA.token_sup : // 1341
        regle58 () ;
      break ;
      case LEX_MJAVA.token_supeg : // 1342
        regle58 () ;
      break ;
      case LEX_MJAVA.token_eg : // 1343
        regle58 () ;
      break ;
      case LEX_MJAVA.token_neg : // 1344
        regle58 () ;
      break ;
      case LEX_MJAVA.token_affect : // 1326
        regle58 () ;
      break ;
      case LEX_MJAVA.token_virg : // 1323
        regle58 () ;
      break ;
      case LEX_MJAVA.token_pv : // 1324
        regle58 () ;
      break ;
      case LEX_MJAVA.token_parf : // 1318
        regle58 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
