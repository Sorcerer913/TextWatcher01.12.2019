package maestro.go.textwatcher01122019;

//import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

//import android.content.pm.ShortcutInfo;
//import android.content.pm.ShortcutManager;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
//import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.auth.FirebaseUser;



public class MainActivity extends AppCompatActivity {


    //private FirebaseAuth mAuth; //  Initialize Firebase       //todo: Firebase


    private EditText editTextUsername;
    private EditText editTextPassword;
    private Button buttonConfirm;

    public StringTester StrTest = new StringTester();

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  Make Toast Of Created Activity
        Toast.makeText(this, "onCreateMainActivity", Toast.LENGTH_SHORT).show();


        /*// Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();*/                   //todo: Firebase


        /*ShortcutManager shortcutManager = getSystemService(ShortcutManager.class);
        ShortcutInfo shortcutStopwatch = new ShortcutInfo.Builder(this, "idStopwatch")
                .setShortLabel("Stopwatch")
                .setLongLabel("Open stopwatch")
                //.setIcon()
                .setIntent(new Intent(MainActivity.this, MainActivity.class).setAction(ACTION_STOPWATCH))
                .build();
        ShortcutInfo shortcutTimer = new ShortcutInfo.Builder(this, "idTimer")
                .setShortLabel("Timer")
                .setLongLabel("Open timer")
                .setIcon(Icon.createWithResource(MainActivity.this, R.drawable.ic_timer_10_black_48dp))
                .setIntent(new Intent(MainActivity.this, MainActivity.class).setAction(ACTION_TIMER))
                .build();
        shortcutManager.setDynamicShortcuts(*//*new ArrayList<ShortcutInfo> = ArrayList<ShortcutInfo>*//*);*/


        editTextUsername = findViewById(R.id.edit_text_username);
        editTextPassword = findViewById(R.id.edit_text_password);
        buttonConfirm = findViewById(R.id.button_confirm);

        editTextUsername.addTextChangedListener(loginTextWatcher);


        editTextPassword.addTextChangedListener(loginTextWatcher);
        buttonConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.super.getApplicationContext(), getResources().getString(R.string.text), Toast.LENGTH_SHORT ).show();
            }
        });



    }

    /*@Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        updateUI(currentUser);
    }*/                                                         //todo: Firebase



    TextWatcher loginTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String usernameInput = editTextUsername.getText().toString().trim();
            String passwordInput = editTextPassword.getText().toString().trim();

            boolean usernameInputGood = ! StrTest.contains(usernameInput, getResources().getStringArray(R.array.validValues));
            boolean passwordInputGood = ! StrTest.contains(passwordInput, getResources().getStringArray(R.array.validValues));

            buttonConfirm.setEnabled( (!usernameInput.isEmpty()) && passwordInput.length() >= 8 );

            /*if(!(passwordInput.contains(".")||passwordInput.contains("/")||passwordInput.contains("\\")||passwordInput.contains(",")||passwordInput.contains("&")||passwordInput.contains("*")||passwordInput.contains("%")||passwordInput.contains("#"))) {

            }*/
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

}
