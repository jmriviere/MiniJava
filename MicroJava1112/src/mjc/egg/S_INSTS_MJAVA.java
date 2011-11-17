package mjc.egg;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
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
      case LEX_MJAVA.token_acf : // 1320
        regle29 () ;
      break ;
      case LEX_MJAVA.token_int : // 1330
        regle30 () ;
      break ;
      case LEX_MJAVA.token_bool : // 1331
        regle30 () ;
      break ;
      case LEX_MJAVA.token_ident : // 1356
        regle30 () ;
      break ;
      case LEX_MJAVA.token_entier : // 1355
        regle30 () ;
      break ;
      case LEX_MJAVA.token_vrai : // 1353
        regle30 () ;
      break ;
      case LEX_MJAVA.token_faux : // 1354
        regle30 () ;
      break ;
      case LEX_MJAVA.token_plus : // 1345
        regle30 () ;
      break ;
      case LEX_MJAVA.token_moins : // 1346
        regle30 () ;
      break ;
      case LEX_MJAVA.token_non : // 1352
        regle30 () ;
      break ;
      case LEX_MJAVA.token_null : // 1338
        regle30 () ;
      break ;
      case LEX_MJAVA.token_paro : // 1317
        regle30 () ;
      break ;
      case LEX_MJAVA.token_nouveau : // 1337
        regle30 () ;
      break ;
      case LEX_MJAVA.token_aco : // 1319
        regle30 () ;
      break ;
      case LEX_MJAVA.token_si : // 1327
        regle30 () ;
      break ;
      case LEX_MJAVA.token_retour : // 1336
        regle30 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
