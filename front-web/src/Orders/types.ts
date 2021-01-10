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
//dica para alterar um nome em todas as ocorrencias  => botão direito => rename symbol
type ProductId = {
    id: number;
}

export type OrderPayLoad = {
    products : ProductId[];
} & OrderLocationData; //concatena orderpayload com orderlocationdata então não há necessidade de recriar/duplicar 