#include<iostream>
#include<stack>
#include<algorithm>
int priority(char c){
    if(c=='^')
    return 3;
  else if(c=='/' || c=='*')
   return 2;
else if(c=='+' || c=='-')
   return 1;
else
   return -1;
   
}
string post(String abc){
    reverse(s.begin(),s.end());
    for(int i=0;i<s.length();i++){
        if(s[i]=='('){
            s[i]=')';
            i++;
        }
        else if(s[i]==')'){
            s[i]='(';
            i++;
        }

    }
    stack<char> st;
    string result="";
    for(int i=0;i<s.length();i++){
        if(isalnum(s[i])){
            result+=s[i];
        }
        else if(s[i]=='('){
            st.push(s[i]);
        }
        else if(s[i]==')'){
            while(!st.empty() && st.top()!='('){
                result+=st.top();
                st.pop();
            }
            st.pop(); // pop the '('
        }
        else{
            while(!st.empty() && priority(st.top())>=priority(s[i])){
                result+=st.top();
                st.pop();
            }
            st.push(s[i]);
        }
        }
    while(!st.empty()){
        result+=st.top();
        st.pop();
    }
    reverse(result.begin(), result.end());
    return result;


}
int main(){
    string s;
    cout<<"Enter the infix expression: ";
    cin>>s;
    string result = post(s);
    cout<<"Postfix expression: "<<result<<endl;
    return 0;
}