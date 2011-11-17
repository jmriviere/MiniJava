package mjc.egg;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
public class S_ERX_MJAVA {
LEX_MJAVA scanner;
  S_ERX_MJAVA() {
    }
  S_ERX_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle43() throws Exception {

    //declaration
    S_OPREL_MJAVA x_2 = new S_OPREL_MJAVA(scanner) ;
    S_ES_MJAVA x_3 = new S_ES_MJAVA(scanner) ;
    //appel
    x_2.analyser() ;
    x_3.analyser() ;
  }
  private void regle44() throws Exception {

    //declaration
    //appel
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MJAVA.token_inf : // 1339
        regle43 () ;
      break ;
      case LEX_MJAVA.token_infeg : // 1340
        regle43 () ;
      break ;
      case LEX_MJAVA.token_sup : // 1341
        regle43 () ;
      break ;
      case LEX_MJAVA.token_supeg : // 1342
        regle43 () ;
      break ;
      case LEX_MJAVA.token_eg : // 1343
        regle43 () ;
      break ;
      case LEX_MJAVA.token_neg : // 1344
        regle43 () ;
      break ;
      case LEX_MJAVA.token_affect : // 1326
        regle44 () ;
      break ;
      case LEX_MJAVA.token_virg : // 1323
        regle44 () ;
      break ;
      case LEX_MJAVA.token_pv : // 1324
        regle44 () ;
      break ;
      case LEX_MJAVA.token_parf : // 1318
        regle44 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
