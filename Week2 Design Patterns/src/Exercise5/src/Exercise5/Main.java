package Exercise5;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create a basic EmailNotifier
        Notifier emailNotifier = new EmailNotifier();

        // Decorate EmailNotifier with SMS functionality
        Notifier smsEmailNotifier = new SMSNotifierDecorator(emailNotifier);

        // Decorate the SMSEmailNotifier with Slack functionality
        Notifier slackSMSEmailNotifier = new SlackNotifierDecorator(smsEmailNotifier);

        // Send a message using the decorated notifier
        slackSMSEmailNotifier.send("Hello, this is a test notification.");
    }
}
