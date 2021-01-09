export type Product = {
    id: number,
    name: string,
    price: number;
    description: string;
    image_uri: string;
}  

export type OrderLocationData = {
    latitude:number;
    longitude:number;
    address: string;

}