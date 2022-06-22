package src.ch.teko.nb.StateMachine;

import java.util.Random;

public class stateMachine implements IState{

    enum Estate{
        Draft,
        Pending,
        InChange,
        Approved
    }

    private String Projekt;


    public stateMachine(String pro, Estate status){
        this.Projekt = pro;
        System.out.println("Der Entwurf " + Projekt + " wird vorgelegt");
        statusprint(status);
    }

    public void statusprint(Estate status){
        Estate Status = status;
        String txt = Status.toString();
        System.out.println("Der Status ist: " + txt);
        System.out.println("\n");
    }
    public int random(){
        Random r = new Random();
        int range = 2; // nimmt immer 1 weniger  sprich 0-1 bei 10 zb 0-9
        int randomint = r.nextInt(range);
        return randomint;
    }

    @Override
    public void submitRequest(stateMachine obj, Estate status) {

        switch (status){
            case Draft:

            case Pending:
                System.out.println("Der Entwurf " + obj.Projekt + " wird geprüft");
                statusprint(status);
                obj.askForChange(obj,status);
                break;
            case InChange:
                System.out.println("Bearbeitetes " + obj.Projekt + " wird geprüft");
                int ergebnis = random();
                System.out.println("" + ergebnis);
                if(ergebnis == 0){
                    System.out.println("Bearbeitetes " + obj.Projekt + " muss nochmals bearbeitet werden");
                    status=Estate.Pending;
                    obj.askForChange(obj, status);
                }else {
                    System.out.println("Bearbeitetes " + obj.Projekt + " ist genehmigt");
                    status = Estate.Approved;
                    obj.approved(obj, status);
                }
                break;
        }
    }

    @Override
    public void askForChange(stateMachine obj, Estate status) {
        System.out.println(obj.Projekt + " wird überarbeitet");
        status=Estate.InChange;
        statusprint(status);
        obj.resubmitRequest(obj, status);

    }

    @Override
    public void resubmitRequest(stateMachine obj, Estate status) {
        System.out.println(obj.Projekt + " wird zur Überprüfung eingereicht");
        statusprint(status);
        obj.submitRequest(obj, status);

    }

    @Override
    public void approved(stateMachine obj, Estate status) {
        System.out.println(obj.Projekt + " ist bereit für die Veröffentlichung");
        status = Estate.Approved;
        statusprint(status);

        System.out.println(obj.Projekt + " erfolgreich Beendet!\n");
    }


    public static void main(String[] args) {

        stateMachine pro1 = new stateMachine("Testprojekt", Estate.Draft);
        pro1.submitRequest(pro1, Estate.Pending);

    }
}

