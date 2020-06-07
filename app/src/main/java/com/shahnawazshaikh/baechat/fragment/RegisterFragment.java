package com.shahnawazshaikh.baechat.fragment;

import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.shahnawazshaikh.baechat.R;

public class RegisterFragment extends Fragment {
    View view;
    RadioGroup radioGroup;
    RadioButton radioButton;
    EditText NameID,EmailID,PhoneID,PassID,ConPassID;
    String name,email,phone,password,conpass,gender;
    public RegisterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_register, container, false);
        radioGroup = (RadioGroup) view.findViewById(R.id.radioSex);
        int radiogrpID = radioGroup.getCheckedRadioButtonId();
        radioButton = (RadioButton) view.findViewById(radiogrpID);
        NameID=view.findViewById(R.id.Name);
        EmailID=view.findViewById(R.id.Email);
        PhoneID=view.findViewById(R.id.Phone);
        PassID=view.findViewById(R.id.Password);
        ConPassID=view.findViewById(R.id.ConfirmPass);
        view.findViewById(R.id.Register).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name=NameID.getText().toString();
                email=EmailID.getText().toString();
                phone=PhoneID.getText().toString();
                password=PassID.getText().toString();
                conpass=ConPassID.getText().toString();
                gender=radioButton.getText().toString();
                if(!(name.isEmpty() || email.isEmpty() || phone.isEmpty() || password.isEmpty() || conpass.isEmpty() || gender.isEmpty())){
                    registerUser();
                }
                else{
                    Toast.makeText(getContext(),"Fields cannot be empty",Toast.LENGTH_SHORT).show();
                }
            }
        });
        return  view;
    }

    private void registerUser() {


    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }
}
