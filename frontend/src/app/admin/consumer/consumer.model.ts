export class Consumer{
  private id:number;

   private  device:String;

   private accountNumber:String;

   private name:String;

   private address:String;

   private poleNumber:String;

   private terminalNumber:String;

   private status:String;

   getId() {
       return this.id;
   }

   setId( id:number) {
       this.id = id;
   }

   getDevice() {
       return this.device;
   }

   setDevice( device:String) {
       this.device = device;
   }

   getAccountNumber() {
       return this.accountNumber;
   }

   setAccountNumber( accountNumber:String) {
       this.accountNumber = accountNumber;
   }

   getName() {
       return this.name;
   }

   setName( name:String) {
       this.name = name;
   }

   getAddress() {
       return this.address;
   }

   setAddress( address:String) {
       this.address = address;
   }

   getPoleNumber() {
       return this.poleNumber;
   }

   setPoleNumber( poleNumber:String) {
       this.poleNumber = poleNumber;
   }

   getTerminalNumber() {
       return this.terminalNumber;
   }

   setTerminalNumber( terminalNumber:String) {
       this.terminalNumber = terminalNumber;
   }

   getStatus() {
        return this.status;
    }

    setStatus( status:String) {
        this.status = status;
    }

   constructor(){

   }

}
