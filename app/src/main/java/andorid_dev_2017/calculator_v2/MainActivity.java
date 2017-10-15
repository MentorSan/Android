package andorid_dev_2017.calculator_v2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//import android.widget.TextView;

import java.util.Stack;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public Stack<String> stack = new Stack<>();
    public double stackOne = 0;
    public double stackTwo = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextView textView = (TextView) findViewById(R.id.text_view);
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
                } else {
                    stack.push(stack.pop() + "1");
                }
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
                } else {
                    stack.push(stack.pop() + "2");
                }
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
                } else {
                    stack.push(stack.pop() + "3");
                }
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
                } else {
                    stack.push(stack.pop() + "4");
                }
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
                } else {
                    stack.push(stack.pop() + "5");
                }
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
                } else {
                    stack.push(stack.pop() + "6");
                }
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
                } else {
                    stack.push(stack.pop() + "7");
                }
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
                } else {
                    stack.push(stack.pop() + "8");
                }
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
                } else {
                    stack.push(stack.pop() + "9");
                }
                break;
            case R.id.button_00:
                if (stack.peek().equals("/") || stack.peek().equals("*") || stack.peek().equals("-")
                        || stack.peek().equals("+")) {
                    switch (stack.peek()) {
                        case "/":
                            //error
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
                } else {
                    stack.push(stack.pop() + "0");
                }
                break;
            case R.id.button_div:
                if (stack.peek().equals("/") || stack.peek().equals("*") || stack.peek().equals("-")
                        || stack.peek().equals("+")) {
                    stack.pop();
                    //checks if there is a dot and removes the dot if that is the case
                } else if (stack.peek().substring(stack.peek().length() - 1).equals(".")) {
                    stack.push(stack.pop().substring(0, stack.peek().length() - 1));
                }
                stack.push("/");
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
                break;
            case R.id.button_clear:
                while (!stack.empty()) {
                    stack.pop();
                }
                break;
            case R.id.button_clearEntry:
                stack.pop();
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
                break;
            
            case R.id.button_result:
                //useless(?)
                break;
        }

    }

}
