/*package src.ch.teko.nb.enumBsp;

public class StateMachine {
    enum LightBulb {
        OFF {
            @Override
            public LightBulb push(int milliSeconds) {
                return (milliSeconds > 500) ? DIMMED : ON;
            }
        },
        ON {
            @Override
            public LightBulb push(int milliSeconds) {
                return OFF;
            }
        },
        DIMMED {
            @Override
            public LightBulb push(int milliSeconds) {
                return (milliSeconds > 503) ? OFF : ON;
            }
        }
    }

        public abstract LightBulb push(int milliSeconds);

        private LightBulb state = LightBulb.OFF;

        public LightBulb push(int milliSeconds) {
            state = state.push(milliSeconds);
        }

        @Override
        public String ToString() {
            return "state = " + state;
        }

        public static void main(String[] args) {
            StateMachine stateMachine = new StateMachine();
            System.out.println(stateMachine);
            for (int milliSeconds = 495; milliSeconds < 505; milliSeconds++) {
                stateMachine.push(milliSeconds);
                System.out.println(stateMachine);
            }
        }
    }*/


