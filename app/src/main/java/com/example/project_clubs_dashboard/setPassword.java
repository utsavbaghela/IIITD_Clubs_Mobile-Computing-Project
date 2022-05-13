package com.example.project_clubs_dashboard;

        import android.content.Intent;
        import android.os.Bundle;

        import androidx.annotation.LongDef;
        import androidx.fragment.app.Fragment;

        import android.util.Log;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;
        import android.widget.Toast;

        import com.google.android.material.textfield.TextInputEditText;
        import com.google.android.material.textfield.TextInputLayout;

        import java.util.regex.Matcher;
        import java.util.regex.Pattern;


public class setPassword extends Fragment {

    private TextInputEditText newPassword, confirmPassword;
    private TextInputLayout newPassLayout, confirmPassLayout;
    private Button submitbtn;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_set_password, container, false);
        initialise(v);

        Button btn = (Button) v.findViewById(R.id.btnsubmit);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate();

                //Intent i3 = new Intent(getActivity(), studentLoginActivity.class);
                //startActivity(i3);
            }
        });
        return v;
    }




    private void initialise(View view)
    {
        newPassword = (TextInputEditText) view.findViewById(R.id.newPassword);
        confirmPassword = (TextInputEditText) view.findViewById(R.id.confirmPassword);
        newPassLayout = (TextInputLayout) view.findViewById(R.id.newPassLayout);
        confirmPassLayout = (TextInputLayout) view.findViewById(R.id.confirmPassLayout);
        submitbtn = (Button) view.findViewById(R.id.btnsubmit);
    }

    private void validate()
    {

        Log.d("Validate:", "In validate function");
        boolean newPassinvalid = PasswordValidator.isValid(newPassword.getText().toString());
        Log.d("newPassinvalid value", String.valueOf(newPassinvalid));
        if(!newPassinvalid)
            newPassLayout.setError("One uppercase, one lowercase, one special character and 8-20 chars required");

        String confirmPass = confirmPassword.getText().toString();
        boolean match = confirmPass.equals(newPassword.getText().toString());
        if(!match)
            confirmPassLayout.setError("Passwords do not match");

    }

    public static class PasswordValidator {

        // digit + lowercase char + uppercase char + punctuation + symbol
        private static final String PASSWORD_PATTERN =
                "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";

        private static final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

        public static boolean isValid(final String password) {
            Matcher matcher = pattern.matcher(password);
            return matcher.matches();
        }

    }


}