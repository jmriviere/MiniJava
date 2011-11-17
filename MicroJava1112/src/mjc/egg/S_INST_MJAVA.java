package mjc.egg;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
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
      case LEX_MJAVA.token_int : // 1330
        regle31 () ;
      break ;
      case LEX_MJAVA.token_bool : // 1331
        regle31 () ;
      break ;
      case LEX_MJAVA.token_ident : // 1356
        scanner.lit ( 2 ) ;
        switch ( scanner.fenetre[1].code ) {
          case LEX_MJAVA.token_ident : // 1356
            regle31 () ;
          break ;
          case LEX_MJAVA.token_pt : // 1325
            regle32 () ;
          break ;
          case LEX_MJAVA.token_paro : // 1317
            regle32 () ;
          break ;
          case LEX_MJAVA.token_mult : // 1348
            regle32 () ;
          break ;
          case LEX_MJAVA.token_div : // 1349
            regle32 () ;
          break ;
          case LEX_MJAVA.token_mod : // 1350
            regle32 () ;
          break ;
          case LEX_MJAVA.token_et : // 1351
            regle32 () ;
          break ;
          case LEX_MJAVA.token_plus : // 1345
            regle32 () ;
          break ;
          case LEX_MJAVA.token_moins : // 1346
            regle32 () ;
          break ;
          case LEX_MJAVA.token_ou : // 1347
            regle32 () ;
          break ;
          case LEX_MJAVA.token_inf : // 1339
            regle32 () ;
          break ;
          case LEX_MJAVA.token_infeg : // 1340
            regle32 () ;
          break ;
          case LEX_MJAVA.token_sup : // 1341
            regle32 () ;
          break ;
          case LEX_MJAVA.token_supeg : // 1342
            regle32 () ;
          break ;
          case LEX_MJAVA.token_eg : // 1343
            regle32 () ;
          break ;
          case LEX_MJAVA.token_neg : // 1344
            regle32 () ;
          break ;
          case LEX_MJAVA.token_affect : // 1326
            regle32 () ;
          break ;
          case LEX_MJAVA.token_pv : // 1324
            regle32 () ;
          break ;
          default :
                   scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[1].getNom()});
scanner.accepter_sucre(LEX_MJAVA.token_ident);
        }
      break ;
      case LEX_MJAVA.token_entier : // 1355
        regle32 () ;
      break ;
      case LEX_MJAVA.token_vrai : // 1353
        regle32 () ;
      break ;
      case LEX_MJAVA.token_faux : // 1354
        regle32 () ;
      break ;
      case LEX_MJAVA.token_plus : // 1345
        regle32 () ;
      break ;
      case LEX_MJAVA.token_moins : // 1346
        regle32 () ;
      break ;
      case LEX_MJAVA.token_non : // 1352
        regle32 () ;
      break ;
      case LEX_MJAVA.token_null : // 1338
        regle32 () ;
      break ;
      case LEX_MJAVA.token_paro : // 1317
        regle32 () ;
      break ;
      case LEX_MJAVA.token_nouveau : // 1337
        regle32 () ;
      break ;
      case LEX_MJAVA.token_aco : // 1319
        regle33 () ;
      break ;
      case LEX_MJAVA.token_si : // 1327
        regle34 () ;
      break ;
      case LEX_MJAVA.token_retour : // 1336
        regle37 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMJAVAMessages.id_MJAVA_unexpected_token,MJAVAMessages.MJAVA_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
