package evolucao;

import java.util.Scanner;

public class Detetive {

  Scanner entrada = new Scanner(System.in);
  App app = new App();
  Regras regras = new Regras();

  public void jogar() {
    System.out.println("Seu adversário é o Detetive");

    for (app.rodadas = 1; app.rodadas <= 10; ++app.rodadas) {
      System.out.println(
        "Digite 1 para inserir uma moeda e 2 para não inserir uma moeda"
      );
      int inserir = entrada.nextInt();

      //#region
      if (app.rodadas == 1 && inserir == 1) {
        app.flag_player = true;
        app.flag_npc = true;
        regras.regras(app.flag_player, app.flag_npc);
        System.out.println("Você inseriu uma moeda");
        System.out.println("Seu adversário inseriu uma moeda");
      } else if (app.rodadas == 1 && inserir == 2) {
        app.flag_player = false;
        app.flag_npc = true;
        regras.regras(app.flag_player, app.flag_npc);
        System.out.println("Você não inseriu uma moeda");
        System.out.println("Seu adversário inseriu uma moeda");
      }
      //#endregion

      //#region
      if (app.rodadas == 2 && inserir == 1) {
        app.flag_player = true;
        app.flag_npc = false;
        regras.regras(app.flag_player, app.flag_npc);
        System.out.println("Você inseriu uma moeda");
        System.out.println("Seu adversário não inseriu uma moeda");
      } else if (app.rodadas == 2 && inserir == 2) {
        app.flag_player = false;
        app.flag_npc = false;
        regras.regras(app.flag_player, app.flag_npc);
        System.out.println("Você não inseriu uma moeda");
        System.out.println("Seu adversário inseriu uma moeda");
      }
      //#endregion

      //#region
      if (app.rodadas == 3 && inserir == 1) {
        app.flag_player = true;
        app.flag_npc = true;
        regras.regras(app.flag_player, app.flag_npc);
        System.out.println("Você inseriu uma moeda");
        System.out.println("Seu adversário não inseriu uma moeda");
      } else if (app.rodadas == 3 && inserir == 2) {
        app.flag_player = false;
        app.flag_npc = true;
        regras.regras(app.flag_player, app.flag_npc);
        System.out.println("Você não inseriu uma moeda");
        System.out.println("Seu adversário inseriu uma moeda");
      }
      //#endregion

      //#region
      if (app.rodadas == 4 && inserir == 1) {
        app.flag_player = true;
        app.flag_npc = true;
        regras.regras(app.flag_player, app.flag_npc);
        System.out.println("Você inseriu uma moeda");
        System.out.println("Seu adversário não inseriu uma moeda");
      } else if (app.rodadas == 4 && inserir == 2) {
        app.flag_player = false;
        app.flag_npc = true;
        regras.regras(app.flag_player, app.flag_npc);
        System.out.println("Você não inseriu uma moeda");
        System.out.println("Seu adversário inseriu uma moeda");
      }
      //#endregion

      //#region
      if (app.rodadas == 5) {
        switch (inserir) {
          case 1:
            app.flag_player = true;
            app.flag_npc = true;
            System.out.println("Seu adversário inseriu uma moeda");
            regras.regras(app.flag_player, app.flag_npc);
            break;
          case 2:
            app.flag_player = false;
            app.flag_npc = true;
            System.out.println("Seu adversário inseriu uma moeda");
            regras.regras(app.flag_player, app.flag_npc);
            break;
        }
      }

      if (app.rodadas > 5) {
        switch (inserir) {
          case 1:
            if (app.flag_npc == true) { //5.1
              System.out.println("Seu adversário não inseriu uma moeda");
              regras.regras(app.flag_player, app.flag_npc);
              break;
            }

            if (app.flag_npc == false) { //5.2
              app.flag_npc = app.flag_player;
              if (app.flag_player = true) {
                app.flag_npc = false;
                System.out.println("Seu adversário não inseriu uma moeda");
                regras.regras(app.flag_player, app.flag_npc);
              }
              if (app.flag_player = false) {
                app.flag_npc = app.flag_player;
                if (app.flag_npc == true) {
                  System.out.println("Seu adversário inseriu uma moeda");
                  regras.regras(app.flag_player, app.flag_npc);
                } else {
                  System.out.println("Seu adversário não inseriu uma moeda");
                  regras.regras(app.flag_player, app.flag_npc);
                }
              }
            }
            break;
          case 2:
            if (app.flag_npc == true) { //5.1
              System.out.println("Seu adversário não inseriu uma moeda");
              regras.regras(app.flag_player, app.flag_npc);
              break;
            }

            if (app.flag_npc == false) { //5.2
              app.flag_npc = app.flag_player;
              if (app.flag_player = true) {
                app.flag_npc = false;
                System.out.println("Seu adversário não inseriu uma moeda");
                regras.regras(app.flag_player, app.flag_npc);
              }
              if (app.flag_player = false) {
                app.flag_npc = app.flag_player;
                if (app.flag_npc == true) {
                  System.out.println("Seu adversário inseriu uma moeda");
                  regras.regras(app.flag_player, app.flag_npc);
                } else {
                  System.out.println("Seu adversário não inseriu uma moeda");
                  regras.regras(app.flag_player, app.flag_npc);
                }
              }
            }
            break;
        }
      }
    }
    //#endregion

  }
}
