package src.ch.teko.nb.StateMachine;

public interface IState {
    public void submitRequest(stateMachine obj, stateMachine.Estate status);
    public void askForChange(stateMachine obj, stateMachine.Estate status);
    public void resubmitRequest(stateMachine obj, stateMachine.Estate status);
    public void approved(stateMachine obj, stateMachine.Estate status);
}
