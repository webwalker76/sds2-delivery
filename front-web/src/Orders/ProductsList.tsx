import { checkIsSelected } from "./helpers";
import ProductsCard from "./ProductCard";
import { Product } from "./types";

type Props = {
    products: Product[];
    onSelectProduct:(product:Product)=> void; 
    selectedProducts:Product[];

}

function ProductsList({products,selectedProducts,onSelectProduct}:Props){
    return(
        <div className="orders-list-container">
            <div className = "orders-list-items">               
               {products.map(products => (
               <ProductsCard 
                    key ={products.id}
                    product={products}
                    onSelectProduct={onSelectProduct}               
                    isSelected = {checkIsSelected(selectedProducts,products)}
               />
               ))}
           </div>
        </div>
            )  
}

export default ProductsList;