    import java.util.Scanner;

    class ATM {
        void withdrawAmount(int balance, int withdraw) {
            int remainingBalance = balance - withdraw;
            System.out.println("Remaining Balance = " + remainingBalance);
            System.out.println("Withdrawal successful");
        }
    }

    class InvalidWithdraw extends Exception {
        InvalidWithdraw(String Error) {
            super(Error);
        }
    }

    class InsufficientBalance extends Exception {
        InsufficientBalance(String Error) {
            super(Error);
        }
    }

    class WithdrawLimit extends Exception {
        WithdrawLimit(String Error) {
            super(Error);
        }
    }

    public class ErrorHandlingCT3 {
        public static void main(String args[]) {
            ATM Axis = new ATM();
            Scanner Input = new Scanner(System.in);
            System.out.println("Enter Balance amount");
            int balance = Input.nextInt();
            System.out.println("Enter Withdraw amount : ");
            int withdraw = Input.nextInt();
            try {
                if (withdraw <= 0) {
                    throw new InvalidWithdraw("Withdraw Amount should be greater than 0");
                }
                if (withdraw > 10000) {
                    throw new WithdrawLimit("Withdraw Amount exceeds daily limit");
                }
                if (withdraw > balance) {
                    throw new InsufficientBalance("Insufficient balance");
                }
                Axis.withdrawAmount(balance, withdraw);
            } catch (InsufficientBalance e) {
                System.out.println(e.getMessage());
            } catch (InvalidWithdraw e) {
                System.out.println(e.getMessage());
            } catch (WithdrawLimit e) {
                System.out.println(e.getMessage());
            }
        }
    }