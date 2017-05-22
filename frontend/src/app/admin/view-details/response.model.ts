export class response{
  private id:number;
  private deviceName:String;
  private t1:String;
  private t2:String;
  private t3:String;
  private t4:String;
  private t5:String;
  private t6:String;
   private opDate:String;
   private opTime:String;
   private status:String;

   getId() {
       return this.id;
   }

   setId(id:number) {
       this.id = id;
   }

   getDeviceName() {
       return this.deviceName;
   }

   setDeviceName(deviceName:String) {
       this.deviceName = deviceName;
   }

   getT1() {
       return this.t1;
   }

   setT1( t1:String) {
       this.t1 = t1;
   }

   getT2() {
       return this.t2;
   }

   setT2(t2:String) {
       this.t2 = t2;
   }

   getT3() {
       return this.t3;
   }

   setT3(t3:String) {
       this.t3 = t3;
   }

   getT4() {
       return this.t4;
   }

   setT4(t4:String) {
       this.t4 = t4;
   }

   getT5() {
       return this.t5;
   }

   setT5(t5:String) {
       this.t5 = t5;
   }

   getT6() {
       return this.t6;
   }

   setT6(t6:String) {
       this.t6 = t6;
   }

   getOpDate() {
       return this.opDate;
   }

   setOpDate(opDate:String) {
       this.opDate = opDate;
   }

   getOpTime() {
       return this.opTime;
   }

   setOpTime(opTime:String) {
       this.opTime = opTime;
   }

   getStatus() {
       return this.status;
   }

   setStatus(status:String) {
       this.status = status;
   }

}
