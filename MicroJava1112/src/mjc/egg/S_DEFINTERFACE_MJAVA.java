package mjc.egg;
import mjc.compiler.*;
import mjc.gc.*;
import mg.egg.eggc.compiler.libjava.lex.*;
import mg.egg.eggc.compiler.libjava.messages.*;
import mg.egg.eggc.compiler.libjava.*;
import mg.egg.eggc.compiler.libjava.problem.IProblem;
import java.util.Vector;
public class S_DEFINTERFACE_MJAVA {
LEX_MJAVA scanner;
  S_DEFINTERFACE_MJAVA() {
    }
  S_DEFINTERFACE_MJAVA(LEX_MJAVA scanner) {
    this.scanner = scanner;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  LEX_MJAVA att_scanner;
  private void regle5() throws Exception {

    //declaration
    T_MJAVA x_2 = new T_MJAVA(scanner ) ;
    T_MJAVA x_3 = new T_MJAVA(scanner ) ;
    S_SUPER_MJAVA x_4 = new S_SUPER_MJAVA(scanner) ;
    S_CORPS_MJAVA x_5 = new S_CORPS_MJAVA(scanner) ;
    //appel
    x_2.analyser(LEX_MJAVA.token_interface);
    x_3.analyser(LEX_MJAVA.token_ident);
    x_4.analyser() ;
    x_5.analyser() ;
  }
  public void analyser () throws Exception {
    regle5 () ;
  }
  }
