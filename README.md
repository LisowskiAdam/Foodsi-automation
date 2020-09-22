# Foodsi-automation
RegisterAccount.java - create new account ( examplemailtest@examplemailtestabcd.xyz / qwertyuiop ). Please note that the user is immediately logged in to account upon tapping 'com.applover.foodsi:id/sign_up_fragment_button' button.

The problem that I encountered during performing registration test was to proceed through the "tutorial" (2 times swipe left and tap 'close' button, which was visible only on the 3rd page of the tutorial). This part probably requires TouchAction() to do 'swipe' action, but it was not functional in my case. If I'd succeed with this part, I'd script tapping on hamburger menu and proceed with the 'log out' action so that I could place registration and login activity scripts in one file.

LoginActivity.java - log in to newly created account ( examplemailtest@examplemailtestabcd.xyz / qwertyuiop )
