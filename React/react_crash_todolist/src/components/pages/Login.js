import React,{Component} from 'react'
import {BrowserRouter as Router, Route} from 'react-router-dom'
import AuthenticationService from './AuthenticationService'

class Login extends Component{
  render(){
    return(
      <Router>
        <Route path="/login" component={LoginComponent} />
        <Route path="/welcome" component={WelcomeComponent} />
        <Route path="/logout" component={LogoutComponent} />
      </Router>
    )
  }
}
class WelcomeComponent extends Component{
    render() {
      return(
      <div>Welcome</div>
      )
    }
}
class LogoutComponent extends Component{
  render(){
    return (
      <>
        <h1>You are logged out</h1>
        <div className="container">
          Thank you for Using our Application
        </div>
      </>
    )
  }
}

class LoginComponent extends Component{
  constructor(props) {
    super(props)
    this.state = {
      username: 'shruti',
      password: '',
      hasLoginFailed: false,
      showSuccessMessagge: false
    }
   // this.handleUsernameChange= this.handleUsernameChange.bind(this)
   // this.handlePasswordChange= this.handlePasswordChange.bind(this)
   this.handleChange= this.handleChange.bind(this)
   this.loginClicked= this.loginClicked.bind(this)
  }

  handleChange(event){
    console.log(this.state);
    this.setState({
      [event.target.name]: event.target.value
    })
  }

 /* handleUsernameChange(event){
    console.log(event.target.value);
    this.setState({
      username: event.target.value
    })
  }

  handlePasswordChange(event){
    console.log(event.target.value);
    this.setState({
      password: event.target.value
    })
  }*/

  loginClicked(){
      if(this.state.username==='shruti' && this.state.password==='dummy'){
        AuthenticationService.registerSuccessfulLogin(this.state.username,this.state.password)
        this.props.history.push("/welcome/${this.state.username}")
        this.setState({showSuccessMessagge:true})
        this.setState({hasLoginFailed:false})
      }
      else{
        this.setState({showSuccessMessagge:false})
        this.setState({hasLoginFailed:true})
      }
  }

  render(){
    return (
      <React.Fragment>
        {this.state.hasLoginFailed && <div>Invalid Credentials</div>}
        <LoginSuccessMessage showSuccessMessagge={this.state.showSuccessMessagge}/>
        <form style={formStyle}>
          
         {/*<ShowInvalidCredentials hasLoginFailed={this.state.hasLoginFailed}/>
         //<LoginSuccessMessage showSuccessMessagge={this.state.showSuccessMessagge}/>*/}

            <div style={login}>Login</div>
           <div style={formdata}> <label>Username:</label>
            <input style={inputStyle} type="text" placeholder="enter username" name="username" value={this.state.username} onChange={this.handleChange}></input>
            <label>Password:</label>
            <input style={inputStyle} type="password" name="password" placeholder="type your password" value={this.state.password} onChange={this.handleChange}></input>
            </div>
            <button style={btn} onClick={this.loginClicked}>Login</button>
        </form>
      </React.Fragment>
    )
  }
}

 function ShowInvalidCredentials(props){
   if(props.hasLoginFailed){
     return <div>Invalid Credentials</div>
   }
   return null
 }
 function LoginSuccessMessage(props){
  if(props.showSuccessMessagge){
    return <div>Login Successful</div>
  }
  return null
 }

const btn = {

    border: 'none',
    background: 'rgb(51, 51, 51)',
    color: 'rgb(255, 255, 255)',
    padding: '7px 20px',
    cursor: 'pointer',
    marginLeft: '226px',
    marginTop: '10px',
    fontWeight: '700'

}

const formStyle = {
border: '1px solid',
width: '335px' ,
marginLeft: '400px',
height: '300px',
marginTop:'48px',
borderRadius: '2px 2px 2px 2px'
}
const formdata= {
    marginTop: '50px',
    marginLeft: '34px',
    width: '2px'
}
const inputStyle={
    marginBottom:'15px',
    height:'23px',
    width:'265px'
}
const login ={
    textAlign: 'center',
    fontSize: '22px',
    fontWeight: '900',
    background: '#333333',
    color: '#fff',
    height: '47px',
    paddingTop: '5px'
}

export default Login;
