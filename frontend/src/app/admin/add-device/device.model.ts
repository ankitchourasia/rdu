import {Consumer} from '../consumer/consumer.model';
import {ViewDetails} from '../view-details/view-details.model';
export class Device{
  private id : number;
  private deviceName : string;
   private feederName: String;
   private poleNumber:String;
   private installationDate:String;
   private zoneName:String;
   private simNo:String;
   private consumers:Array<Consumer>;
   private viewDetails:ViewDetails;
   private status : string;

  constructor(){

  }

    getId() {
        return this.id;
    }

    setId(id:number) {
        this.id = id;
    }

    getDeviceName():string {
        return this.deviceName;
    }

    setDeviceName( deviceName:string) {
        this.deviceName = deviceName;
    }

    getFeederName() {
        return this.feederName;
    }

    setFeederName(feederName:String) {
        this.feederName = feederName;
    }

    getPoleNumber() {
        return this.poleNumber;
    }

    setPoleNumber(poleNumber:String) {
        this.poleNumber = poleNumber;
    }

    getInstallationDate() {
        return this.installationDate;
    }

    setInstallationDate( installationDate:String) {
        this.installationDate = installationDate;
    }

    getZoneName() {
        return this.zoneName;
    }

    setZoneName( zoneName:String) {
        this.zoneName = zoneName;
    }

    getSimNo() {
        return this.simNo;
    }

    setSimNo( simNo:String) {
        this.simNo = simNo;
    }
    getConsumers() {
        return this.consumers;
    }

    setConsumers( consumers:Array<Consumer>) {
        this.consumers = consumers;
    }
    getViewDetails(){
      return this.viewDetails;
    }
    setViewDetails(viewDetails:ViewDetails){
      this.viewDetails = viewDetails;
    }

    getStatus():string{
      return this.status;
    }

    setStatus(status : string){
      this.status = status;
    }
}
