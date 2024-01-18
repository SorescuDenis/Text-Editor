package com.example.text_editor_sdv;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextTextMultiLine);
    }
    public void buttonBold(View view){
    Spannable spannableString = new SpannableStringBuilder(editText.getText());                     // Make string for all text
    spannableString.setSpan(new StyleSpan(Typeface.BOLD), editText.getSelectionStart(), editText.getSelectionEnd(), 0);   //Make string for selected text then make it bold
    editText.setText(spannableString);                                                              // Set edited text to page
    }
    public void buttonItalic(View view){
        Spannable spannableString = new SpannableStringBuilder(editText.getText());
        spannableString.setSpan(new StyleSpan(Typeface.ITALIC), editText.getSelectionStart(), editText.getSelectionEnd(), 0);
        editText.setText(spannableString);
    }
    public void buttonUnderline(View view){
        Spannable spannableString = new SpannableStringBuilder(editText.getText());
        spannableString.setSpan(new UnderlineSpan(), editText.getSelectionStart(), editText.getSelectionEnd(), 0);
        editText.setText(spannableString);
    }
    public void buttonRalign(View view){
        editText.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);                                    //method for text allignment
        Spannable spannableString = new SpannableStringBuilder(editText.getText());                 //make string with all text
        editText.setText(spannableString);                                                          //set alligned string to page
    }
    public void buttonCalign(View view){
        editText.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        Spannable spannableString = new SpannableStringBuilder(editText.getText());
        editText.setText(spannableString);
    }
    public void buttonLalign(View view){
        editText.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        Spannable spannableString = new SpannableStringBuilder(editText.getText());
        editText.setText(spannableString);
    }
    public void buttonReset(View view){
        Spannable spannableString = new SpannableStringBuilder(editText.getText());                 //set string with all text
        editText.setText(spannableString.toString());                                               //make it simple string then set it to page
    }
    }
