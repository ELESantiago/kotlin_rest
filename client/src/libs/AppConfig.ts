export class AppConfig {
    static apiUrl: any = function(){
        return `http://localhost:8080/api`;
        //return  `http://${window.location.host}/api`;
    };
    static timezone: string = 'America/Monterrey';
    static version: string = '0.0.1';
}