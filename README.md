# Shopping-platform

Project was designed to practice design patterns namely builder and strategy. It was better than expected so I added frontend using window builder and published it.


Quick guide - if you have no time to explore app just click on numbered highlighted buttons follow sequence(first click DefaultOffer 1. , than Add 2. and so on).


Advanced details:


Architecture:

Builder: ContactInformation(Name(title, firstName, surrname), Adress(city, street, houseNumber)), CardInformation(cardNumber, securityNumber, expirationDay, expirationMonth)


Strategy: (PayByCreditCard, PayByDebitCard, PayInCash, PayIngold) ---> extends Pay(these classes using methods from Pay) + implements interface PaymentStrategy(classes are ipmlementing pay() in different way), TypeOfPayment has PaymentStrategy variable(choosing specific implementation of pay())


(DeliveryByCar, DeliveryByDrone) ---> extends Delivery(these classes using methods from Delivery) + implements interface ShippingStrategy(classes are ipmlementing delivery() in different way), TypeOfDelivery has ShippingStrategy variable(choosing specific implementation of delivery())
