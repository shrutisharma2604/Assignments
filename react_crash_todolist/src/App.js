import React, { Component } from 'react';
import {BrowserRouter as Router,Route} from 'react-router-dom';
import Header from './components/layout/Header';
import Todos from './components/Todos';
import AddTodo from './components/AddTodo';
//import {v4 as uuidv4} from 'uuid';
import './App.css';
import About from './components/pages/About';
import LoginComponent from './components/pages/Login'
import WelcomeComponent from './components/pages/Login'
import LogoutComponent from './components/pages/Login'
//import AuthenticationService from './components/security/AuthenticationService'
import axios from 'axios';

class App extends Component {

  state = {
    todos:  [
        /*{
            id: 1,
            title: 'Take out the trash',
            completed: false
        },
        {
            id: 2,
            title: 'Dinner',
            completed: false
        },
        {
            id: 3,
            title: 'Meeting',
            completed: false
        } */   
    ],
};

componentDidMount() {
  axios.get('http://localhost:8080/todo/view')
  .then(res => this.setState({todos: res.data}))
}


// Toggle Complete
markComplete = (id) => {
  this.setState({ todos: this.state.todos.map(todo => {
    if(todo.id === id){
      todo.completed = !todo.completed
    }
    return todo;
  }
  )});
}

// Delete Todo
delTodo = (id,title) => {
  //this.setState({ todos: [...this.state.todos.filter(todo => todo.id!==id)]});
  axios.delete('http://localhost:8080/todo/todos/5' , {
    id,
    title,
    completed: false
  })
  .then(res => {
    this.setState({message:null});
  }
    )
  .catch(ex => console.log(ex))
}

// Add Todo
addTodo = (title,id) => {
  /*const newTodo = {
    title,
    completed: false
  }
  .then(this.setState({ todos: [...this.state.todos, newTodo ]}))*/
  axios.post('http://localhost:8080/todo/addTodo' , {
    id,
    title,
    completed: false
  })
  .then(res => {
    this.setState({message:null});
  }
    )
  .catch(ex => console.log(ex))
}

  render(){
  return (
    <Router>
    <div className="App">
      <div className="container">
      <Header />
      <Route exact path="/" render={props => (
        <React.Fragment>
          <AddTodo addTodo={this.addTodo}/>
          <Todos todos={this.state.todos} markComplete={this.markComplete} delTodo={this.delTodo}/>
        </React.Fragment>
      )} />
      <Route path="/about" component={About}/>
      <Route path="/login" component={LoginComponent}/>
      <Route path="/welcome" component={WelcomeComponent} />
      <Route path="/logout" component={LogoutComponent} />
     
      </div>
    </div>
    </Router>
  );
}
}

export default App;
