package andorid_dev_2017.calculator_v2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Stack;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public Stack<String> stack = new Stack<>();
    public double stackOne = 0;
    public double stackTwo = 0;
    public boolean isResult = false;
    public String viewedText = "";
    public enum operator {
        ADD,SUB,DIV,MUL
    }
    public operator lastOperator;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stack.push("0");

        textView = (TextView) findViewById(R.id.text_view);
        Button button01 = (Button) findViewById(R.id.button_01);
        button01.setOnClickListener(this);
        Button button02 = (Button) findViewById(R.id.button_02);
        button02.setOnClickListener(this);
        Button button03 = (Button) findViewById(R.id.button_03);
        button03.setOnClickListener(this);
        Button button04 = (Button) findViewById(R.id.button_04);
        button04.setOnClickListener(this);
        Button button05 = (Button) findViewById(R.id.button_05);
        button05.setOnClickListener(this);
        Button button06 = (Button) findViewById(R.id.button_06);
        button06.setOnClickListener(this);
        Button button07 = (Button) findViewById(R.id.button_07);
        button07.setOnClickListener(this);
        Button button08 = (Button) findViewById(R.id.button_08);
        button08.setOnClickListener(this);
        Button button09 = (Button) findViewById(R.id.button_09);
        button09.setOnClickListener(this);
        Button button00 = (Button) findViewById(R.id.button_00);
        button00.setOnClickListener(this);
        Button buttonDiv = (Button) findViewById(R.id.button_div);
        buttonDiv.setOnClickListener(this);
        Button buttonMul = (Button) findViewById(R.id.button_mul);
        buttonMul.setOnClickListener(this);
        Button buttonSub = (Button) findViewById(R.id.button_sub);
        buttonSub.setOnClickListener(this);
        Button buttonAdd = (Button) findViewById(R.id.button_add);
        buttonAdd.setOnClickListener(this);
        Button buttonC = (Button) findViewById(R.id.button_clear);
        buttonC.setOnClickListener(this);
        Button buttonCE = (Button) findViewById(R.id.button_clearEntry);
        buttonCE.setOnClickListener(this);
        Button buttonDot = (Button) findViewById(R.id.button_dot);
        buttonDot.setOnClickListener(this);
        Button buttonResult = (Button) findViewById(R.id.button_result);
        buttonResult.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_01:
                if (stack.peek().equals("/") || stack.peek().equals("*") || stack.peek().equals("-")
                        || stack.peek().equals("+")) {
                    switch (stack.peek()) {
                        case "/":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne / 1;
                            stack.push("" + stackTwo);
                            break;
                        case "*":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne * 1;
                            stack.push("" + stackTwo);
                            break;
                        case "-":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne - 1;
                            stack.push("" + stackTwo);
                            break;
                        case "+":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne + 1;
                            stack.push("" + stackTwo);
                            break;
                    }
                } else if (stack.peek().equals("0")) {
                    stack.pop();
                    stack.push("1");
                    //Checks if the stack on the top is a result
                } else if (isResult) {
                    isResult = false;
                    stack.pop();
                    stack.push("1");
                } else {
                    stack.push(stack.pop() + "1");
                }
                viewedText = viewedText + "1";
                textView.setText(viewedText);
                break;
            case R.id.button_02:
                if (stack.peek().equals("/") || stack.peek().equals("*") || stack.peek().equals("-")
                        || stack.peek().equals("+")) {
                    switch (stack.peek()) {
                        case "/":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne / 2;
                            stack.push("" + stackTwo);
                            break;
                        case "*":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne * 2;
                            stack.push("" + stackTwo);
                            break;
                        case "-":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne - 2;
                            stack.push("" + stackTwo);
                            break;
                        case "+":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne + 2;
                            stack.push("" + stackTwo);
                            break;
                    }
                } else if (stack.peek().equals("0")) {
                    stack.pop();
                    stack.push("2");
                    //Checks if the stack on the top is a result
                } else if (isResult) {
                    isResult = false;
                    stack.pop();
                    stack.push("2");
                } else {
                    stack.push(stack.pop() + "2");
                }
                viewedText = viewedText + "2";
                textView.setText(viewedText);
                break;
            case R.id.button_03:
                if (stack.peek().equals("/") || stack.peek().equals("*") || stack.peek().equals("-")
                        || stack.peek().equals("+")) {
                    switch (stack.peek()) {
                        case "/":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne / 3;
                            stack.push("" + stackTwo);
                            break;
                        case "*":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne * 3;
                            stack.push("" + stackTwo);
                            break;
                        case "-":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne - 3;
                            stack.push("" + stackTwo);
                            break;
                        case "+":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne + 3;
                            stack.push("" + stackTwo);
                            break;
                    }
                } else if (stack.peek().equals("0")) {
                    stack.pop();
                    stack.push("3");
                    //Checks if the stack on the top is a result
                } else if (isResult) {
                    isResult = false;
                    stack.pop();
                    stack.push("3");
                } else {
                    stack.push(stack.pop() + "3");
                }
                viewedText = viewedText + "3";
                textView.setText(viewedText);
                break;
            case R.id.button_04:
                if (stack.peek().equals("/") || stack.peek().equals("*") || stack.peek().equals("-")
                        || stack.peek().equals("+")) {
                    switch (stack.peek()) {
                        case "/":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne / 4;
                            stack.push("" + stackTwo);
                            break;
                        case "*":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne * 4;
                            stack.push("" + stackTwo);
                            break;
                        case "-":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne - 4;
                            stack.push("" + stackTwo);
                            break;
                        case "+":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne + 4;
                            stack.push("" + stackTwo);
                            break;
                    }
                } else if (stack.peek().equals("0")) {
                    stack.pop();
                    stack.push("4");
                    //Checks if the stack on the top is a result
                } else if (isResult) {
                    isResult = false;
                    stack.pop();
                    stack.push("4");
                } else {
                    stack.push(stack.pop() + "4");
                }
                viewedText = viewedText + "4";
                textView.setText(viewedText);
                break;
            case R.id.button_05:
                if (stack.peek().equals("/") || stack.peek().equals("*") || stack.peek().equals("-")
                        || stack.peek().equals("+")) {
                    switch (stack.peek()) {
                        case "/":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne / 5;
                            stack.push("" + stackTwo);
                            break;
                        case "*":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne * 5;
                            stack.push("" + stackTwo);
                            break;
                        case "-":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne - 5;
                            stack.push("" + stackTwo);
                            break;
                        case "+":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne + 5;
                            stack.push("" + stackTwo);
                            break;
                    }
                } else if (stack.peek().equals("0")) {
                    stack.pop();
                    stack.push("5");
                    //Checks if the stack on the top is a result
                } else if (isResult) {
                    isResult = false;
                    stack.pop();
                    stack.push("5");
                } else {
                    stack.push(stack.pop() + "5");
                }
                viewedText = viewedText + "5";
                textView.setText(viewedText);
                break;
            case R.id.button_06:
                if (stack.peek().equals("/") || stack.peek().equals("*") || stack.peek().equals("-")
                        || stack.peek().equals("+")) {
                    switch (stack.peek()) {
                        case "/":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne / 6;
                            stack.push("" + stackTwo);
                            break;
                        case "*":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne * 6;
                            stack.push("" + stackTwo);
                            break;
                        case "-":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne - 6;
                            stack.push("" + stackTwo);
                            break;
                        case "+":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne + 6;
                            stack.push("" + stackTwo);
                            break;
                    }
                } else if (stack.peek().equals("0")) {
                    stack.pop();
                    stack.push("6");
                    //Checks if the stack on the top is a result
                } else if (isResult) {
                    isResult = false;
                    stack.pop();
                    stack.push("6");
                } else {
                    stack.push(stack.pop() + "6");
                }
                viewedText = viewedText + "6";
                textView.setText(viewedText);
                break;
            case R.id.button_07:
                if (stack.peek().equals("/") || stack.peek().equals("*") || stack.peek().equals("-")
                        || stack.peek().equals("+")) {
                    switch (stack.peek()) {
                        case "/":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne / 7;
                            stack.push("" + stackTwo);
                            break;
                        case "*":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne * 7;
                            stack.push("" + stackTwo);
                            break;
                        case "-":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne - 7;
                            stack.push("" + stackTwo);
                            break;
                        case "+":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne + 7;
                            stack.push("" + stackTwo);
                            break;
                    }
                } else if (stack.peek().equals("0")) {
                    stack.pop();
                    stack.push("7");
                    //Checks if the stack on the top is a result
                } else if (isResult) {
                    isResult = false;
                    stack.pop();
                    stack.push("7");
                } else {
                    stack.push(stack.pop() + "7");
                }
                viewedText = viewedText + "7";
                textView.setText(viewedText);
                break;
            case R.id.button_08:
                if (stack.peek().equals("/") || stack.peek().equals("*") || stack.peek().equals("-")
                        || stack.peek().equals("+")) {
                    switch (stack.peek()) {
                        case "/":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne / 8;
                            stack.push("" + stackTwo);
                            break;
                        case "*":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne * 8;
                            stack.push("" + stackTwo);
                            break;
                        case "-":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne - 8;
                            stack.push("" + stackTwo);
                            break;
                        case "+":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne + 8;
                            stack.push("" + stackTwo);
                            break;
                    }
                } else if (stack.peek().equals("0")) {
                    stack.pop();
                    stack.push("8");
                    //Checks if the stack on the top is a result
                } else if (isResult) {
                    isResult = false;
                    stack.pop();
                    stack.push("8");
                } else {
                    stack.push(stack.pop() + "8");
                }
                viewedText = viewedText + "8";
                textView.setText(viewedText);
                break;
            case R.id.button_09:
                if (stack.peek().equals("/") || stack.peek().equals("*") || stack.peek().equals("-")
                        || stack.peek().equals("+")) {
                    switch (stack.peek()) {
                        case "/":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne / 9;
                            stack.push("" + stackTwo);
                            break;
                        case "*":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne * 9;
                            stack.push("" + stackTwo);
                            break;
                        case "-":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne - 9;
                            stack.push("" + stackTwo);
                            break;
                        case "+":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne + 9;
                            stack.push("" + stackTwo);
                            break;
                    }
                } else if (stack.peek().equals("0")) {
                    stack.pop();
                    stack.push("9");
                    //Checks if the stack on the top is a result
                } else if (isResult) {
                    isResult = false;
                    stack.pop();
                    stack.push("9");
                } else {
                    stack.push(stack.pop() + "9");
                }
                viewedText = viewedText + "9";
                textView.setText(viewedText);
                break;
            case R.id.button_00:
                if (stack.peek().equals("/") || stack.peek().equals("*") || stack.peek().equals("-")
                        || stack.peek().equals("+")) {
                    switch (stack.peek()) {
                        case "/":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne / 0;
                            stack.push("" + stackTwo);
                            break;
                        case "*":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne * 0;
                            stack.push("" + stackTwo);
                            break;
                        case "-":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne - 0;
                            stack.push("" + stackTwo);
                            break;
                        case "+":
                            stack.pop();
                            stackOne = Double.parseDouble(stack.pop());
                            stackTwo = stackOne + 0;
                            stack.push("" + stackTwo);
                            break;
                    }
                } else if (stack.peek().equals("0")) {
                    stack.pop();
                    stack.push("0");
                    //Checks if the stack on the top is a result
                } else if (isResult) {
                    isResult = false;
                    stack.pop();
                    stack.push("0");
                } else {
                    stack.push(stack.pop() + "0");
                }
                viewedText = viewedText + "0";
                textView.setText(viewedText);
                break;
            //iwas stimmt hier nicht
            case R.id.button_div:
                if (stack.peek().equals("/") || stack.peek().equals("*") || stack.peek().equals("-")
                        || stack.peek().equals("+")) {
                    stack.pop();
                    stack.push("/");
                    viewedText = viewedText.substring(0, viewedText.length() - 1);
                    //checks if there is a dot and removes the dot if that is the case
                } else if (stack.peek().substring(stack.peek().length() - 1).equals(".")) {
                    stack.push(stack.pop().substring(0, stack.peek().length() - 1));
                    viewedText = viewedText.substring(0, viewedText.length() - 1);
                }
                isResult = true;
                textView.setText(viewedText);
                break;
            case R.id.button_mul:
                if (stack.peek().equals("/") || stack.peek().equals("*") || stack.peek().equals("-")
                        || stack.peek().equals("+")) {
                    stack.pop();
                    //checks if there is a dot and removes the dot if that is the case
                } else if (stack.peek().substring(stack.peek().length() - 1).equals(".")) {
                    stack.push(stack.pop().substring(0, stack.peek().length() - 1));
                }
                stack.push("*");
                isResult = true;
                viewedText = viewedText + "*";
                textView.setText(viewedText);
                break;
            case R.id.button_sub:
                if (stack.peek().equals("/") || stack.peek().equals("*") || stack.peek().equals("-")
                        || stack.peek().equals("+")) {
                    stack.pop();
                    //checks if there is a dot and removes the dot if that is the case
                } else if (stack.peek().substring(stack.peek().length() - 1).equals(".")) {
                    stack.push(stack.pop().substring(0, stack.peek().length() - 1));
                }
                stack.push("-");
                isResult = true;
                viewedText = viewedText + "-";
                textView.setText(viewedText);
                break;
            case R.id.button_add:
                if (stack.peek().equals("/") || stack.peek().equals("*") || stack.peek().equals("-")
                        || stack.peek().equals("+")) {
                    stack.pop();
                    //checks if there is a dot and removes the dot if that is the case
                } else if (stack.peek().substring(stack.peek().length() - 1).equals(".")) {
                    stack.push(stack.pop().substring(0, stack.peek().length() - 1));
                }
                stack.push("+");
                isResult = true;
                viewedText = viewedText + "+";
                textView.setText(viewedText);
                break;
            case R.id.button_clear:
                while (!stack.empty()) {
                    stack.pop();
                }
                stack.push("0");
                viewedText = "";
                textView.setText(viewedText);
                break;
            case R.id.button_clearEntry:
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push("0");
                    viewedText = "";
                }
                viewedText = viewedText.substring(0, viewedText.indexOf("+") + 1);
                textView.setText(viewedText);
                break;
            case R.id.button_dot:
                if (stack.peek().equals("/") || stack.peek().equals("*") || stack.peek().equals("-")
                        || stack.peek().equals("+")) {
                    stack.push("0.");
                    //checks if there is a dot at the end of the String or somewhere in the String, and if that's the case do nothing
                } else if (stack.peek().substring(stack.peek().length() - 1).equals(".") || stack.peek().indexOf('.') > -1) {
                    //error
                } else {
                    stack.push(stack.pop() + ".");
                }
                viewedText = viewedText + ".";
                textView.setText(viewedText);
                break;

            case R.id.button_result:
                viewedText = "";
                textView.setText(stack.peek());
                break;
        }
        if (stack.peek().length() >= 2 && stack.peek().substring(stack.peek().length() - 2).equals(".0")) {
            stack.push(stack.peek().replace(".0", ""));
        }

    }

}
