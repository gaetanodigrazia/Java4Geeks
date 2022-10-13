package com.java4geeks.streamvsforloop;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class Order {
    String id;
    int amount;
    int streetNumber;
    String code;
    String email;
    String shopCode;
    String street;
    String note;
    String description;
    String evenOrOdd;
    String firstOrSecondPartOfStreet;
    Random random;
    
        public Order(){
        random = new Random();
        setId(RandomStringUtils.randomAlphabetic(100));
        setAmount(random.nextInt(100000000));
        setStreetNumber(random.nextInt(100000));
        setCode(RandomStringUtils.randomAlphabetic(100));
        setEmail(RandomStringUtils.randomAlphabetic(100));
        setShopCode(RandomStringUtils.randomAlphabetic(100));
        setStreet(RandomStringUtils.randomAlphabetic(100));
        setNote(RandomStringUtils.randomAlphabetic(100));
        setDescription(RandomStringUtils.randomAlphabetic(100));
        setEvenOrOdd(getAmount() % 2 == 0 ? "Even" : "Odd");
        setFirstOrSecondPartOfStreet(getStreetNumber() > random.nextInt(100000) ? "Second" : "First");
        
    }

		/**
		 * @return the id
		 */
		public String getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(String id) {
			this.id = id;
		}

		/**
		 * @return the amount
		 */
		public int getAmount() {
			return amount;
		}

		/**
		 * @param amount the amount to set
		 */
		public void setAmount(int amount) {
			this.amount = amount;
		}

		/**
		 * @return the code
		 */
		public String getCode() {
			return code;
		}

		/**
		 * @param code the code to set
		 */
		public void setCode(String code) {
			this.code = code;
		}

		/**
		 * @return the email
		 */
		public String getEmail() {
			return email;
		}

		/**
		 * @param email the email to set
		 */
		public void setEmail(String email) {
			this.email = email;
		}

		/**
		 * @return the shopCode
		 */
		public String getShopCode() {
			return shopCode;
		}

		/**
		 * @param shopCode the shopCode to set
		 */
		public void setShopCode(String shopCode) {
			this.shopCode = shopCode;
		}

		/**
		 * @return the street
		 */
		public String getStreet() {
			return street;
		}

		/**
		 * @param street the street to set
		 */
		public void setStreet(String street) {
			this.street = street;
		}

		/**
		 * @return the streetNumber
		 */
		public int getStreetNumber() {
			return streetNumber;
		}

		/**
		 * @param streetNumber the streetNumber to set
		 */
		public void setStreetNumber(int streetNumber) {
			this.streetNumber = streetNumber;
		}

		/**
		 * @return the note
		 */
		public String getNote() {
			return note;
		}

		/**
		 * @param note the note to set
		 */
		public void setNote(String note) {
			this.note = note;
		}

		/**
		 * @return the description
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * @param description the description to set
		 */
		public void setDescription(String description) {
			this.description = description;
		}

		/**
		 * @return the evenOrOdd
		 */
		public String getEvenOrOdd() {
			return evenOrOdd;
		}

		/**
		 * @param evenOrOdd the evenOrOdd to set
		 */
		public void setEvenOrOdd(String evenOrOdd) {
			this.evenOrOdd = evenOrOdd;
		}

		/**
		 * @return the firstOrSecondPartOfStreet
		 */
		public String getFirstOrSecondPartOfStreet() {
			return firstOrSecondPartOfStreet;
		}

		/**
		 * @param firstOrSecondPartOfStreet the firstOrSecondPartOfStreet to set
		 */
		public void setFirstOrSecondPartOfStreet(String firstOrSecondPartOfStreet) {
			this.firstOrSecondPartOfStreet = firstOrSecondPartOfStreet;
		}

		/**
		 * @return the random
		 */
		public Random getRandom() {
			return random;
		}

		/**
		 * @param random the random to set
		 */
		public void setRandom(Random random) {
			this.random = random;
		}
}
