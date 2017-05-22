export class User{
  private id : number;
  private username : String;
  private password : String;

constructor(){

}

  getId() {
         return this.id;
     }

   setId(id:number) {
         this.id = id;
     }

    getUsername() {
         return this.username;
     }

  setUsername(username: String) {
         this.username = username;
     }

    getPassword() {
         return this.password;
     }

    setPassword(password:String) {
         this.password = password;
     }
}
